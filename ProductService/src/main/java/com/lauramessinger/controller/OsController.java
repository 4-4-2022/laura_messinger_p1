package com.lauramessinger.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lauramessinger.entity.Os;
import com.lauramessinger.service.OsService;
@RestController
public class OsController {
	@Autowired
	private OsService osService;
	

	
	@GetMapping(value = "/products/os")
	public List<Os> getAll() {	
		return osService.getOs();
	}
	
	
	@PostMapping(value = "/products/os/search")
	@ResponseBody
	public List<Os> findOs(@RequestParam Map<String, String> parameters){
		
		Os probe = new Os();
		probe.setManufacturer(parameters.get("manufacturer"));
		
		return osService.getOsByExample(probe);
	}
}
