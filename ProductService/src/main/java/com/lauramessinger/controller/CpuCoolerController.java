package com.lauramessinger.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping(value = "/products/coolers/search")
	public List<CpuCooler> findCoolers(@RequestParam Map<String, String> parameters){
		
		CpuCooler probe = new CpuCooler();
		
		probe.setLiquid(Boolean.parseBoolean(parameters.get("liquid")));

		//for some reason corsair returns all
		probe.setManufacturer(parameters.get("manufacturer"));
		
		return coolerService.getCoolersByExample(probe);
	}
	
}
