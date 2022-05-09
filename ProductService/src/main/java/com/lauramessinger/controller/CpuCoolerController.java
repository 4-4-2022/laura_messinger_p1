package com.lauramessinger.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lauramessinger.entity.CpuCooler;
import com.lauramessinger.service.CpuCoolerService;
@RestController
public class CpuCoolerController {
	
	@Autowired
	private CpuCoolerService coolerService;
	
	
	@GetMapping(value = "/products/coolers")
	public List<CpuCooler> getAll() {	
		return coolerService.getCoolers();
	}
	
	@PostMapping(value = "/products/coolers/search")
	@ResponseBody
	public List<CpuCooler> findCoolers(@RequestParam Map<String, String> parameters){
		
		CpuCooler probe = new CpuCooler();
		
		probe.setLiquid(Boolean.parseBoolean(parameters.get("liquid")));
		
		return coolerService.getCoolersByExample(probe);
	}
	
}
