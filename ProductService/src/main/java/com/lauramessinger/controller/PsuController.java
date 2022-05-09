package com.lauramessinger.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lauramessinger.entity.Psu;
import com.lauramessinger.service.PsuService;
@RestController
public class PsuController {
	@Autowired
	private PsuService psuService;
	

	
	@GetMapping(value = "/products/psu")
	public List<Psu> getAll() {	
		return psuService.getPsu();
	}
	
	
	@PostMapping(value = "/products/psu/search")
	@ResponseBody
	public List<Psu> findPsu(@RequestParam Map<String, String> parameters){
		
		Psu probe = new Psu();
		probe.setManufacturer(parameters.get("manufacturer"));
		
		return psuService.getCoolersByExample(probe);
	}
}
