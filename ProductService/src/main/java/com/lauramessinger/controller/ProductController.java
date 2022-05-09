package com.lauramessinger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.lauramessinger.entity.Product;
import com.lauramessinger.service.CaseService;
import com.lauramessinger.service.CpuCoolerService;
import com.lauramessinger.service.CpuService;
import com.lauramessinger.service.GpuService;
import com.lauramessinger.service.MemoryService;
import com.lauramessinger.service.MonitorService;
import com.lauramessinger.service.MotherboardService;
import com.lauramessinger.service.OsService;
import com.lauramessinger.service.ProductService;
import com.lauramessinger.service.PsuService;
import com.lauramessinger.service.StorageService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private ProductService productService;
	@Autowired
	private CaseService caseService;
	@Autowired
	private CpuCoolerService coolerService;
	@Autowired
	private CpuService cpuService;
	@Autowired
	private GpuService gpuService;
	@Autowired
	private MemoryService memoryService;
	@Autowired
	private MonitorService monitorService;
	@Autowired
	private MotherboardService motherboardService;
	@Autowired
	private OsService osService;
	@Autowired
	private PsuService psuService;
	@Autowired
	private StorageService storageService;
	
	/*
	@PostMapping("/all")
	@ResponseBody
	public List<Product> getAll(
			@RequestBody Product probe, 
			@RequestParam(name="sort", defaultValue="uid") String sort,
			@RequestParam(name="order", defaultValue="asc") String order){
		return productService.getAll(probe);
	}
	*/
	
	@GetMapping(value = "/all")
	public ResponseEntity<List<Product>> getAll() {	
		return new ResponseEntity<List<Product>>(productService.getAll(), HttpStatus.OK);
	}
	
	/*
	@GetMapping(value = "/cases")
	public ResponseEntity<List<Product>> getCases() {
		return new ResponseEntity<List<Product>>(caseService.getAll(), HttpStatus.OK);
	}
	*/

}
