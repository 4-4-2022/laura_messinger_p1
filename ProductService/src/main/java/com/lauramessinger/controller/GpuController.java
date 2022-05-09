package com.lauramessinger.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lauramessinger.entity.Gpu;
import com.lauramessinger.service.GpuService;

@RestController
public class GpuController {
	
	@Autowired
	private GpuService gpuService;

	
	@GetMapping(value = "/products/gpu")
	public List<Gpu> getAll() {	
		return gpuService.getGpu();
	}
	
	
	@GetMapping(value = "/products/gpu/search")
	public List<Gpu> findGpu(@RequestParam Map<String, String> parameters){
		
		Gpu probe = new Gpu();
		probe.setManufacturer(parameters.get("manufacturer"));
		
		return gpuService.getCoolersByExample(probe);
	}
	
}
