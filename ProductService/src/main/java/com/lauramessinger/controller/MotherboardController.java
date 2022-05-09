package com.lauramessinger.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lauramessinger.entity.Motherboard;
import com.lauramessinger.service.MotherboardService;
@RestController
public class MotherboardController {
	@Autowired
	private MotherboardService motherboardService;
	
	@GetMapping(value = "/products/mobos")
	public List<Motherboard> getAll() {	
		return motherboardService.getMobos();
	}
	
	@GetMapping(value = "/products/mobos/search")
	public List<Motherboard> findMobos(@RequestParam Map<String, String> parameters){
		
		Motherboard probe = new Motherboard();
		probe.setManufacturer(parameters.get("manufacturer"));
		
		return motherboardService.getCoolersByExample(probe);
	}
}
