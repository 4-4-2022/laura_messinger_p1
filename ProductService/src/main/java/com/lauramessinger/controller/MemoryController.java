package com.lauramessinger.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lauramessinger.entity.Memory;
import com.lauramessinger.service.MemoryService;
@RestController
public class MemoryController {
	
	@Autowired
	private MemoryService memoryService;
	
	@GetMapping(value = "/products/memory")
	public List<Memory> getAll() {	
		return memoryService.getMemory();
	}
	
	@PostMapping(value = "/products/memory/search")
	@ResponseBody
	public List<Memory> findMemory(@RequestParam Map<String, String> parameters){
		
		Memory probe = new Memory();
		probe.setManufacturer(parameters.get("manufacturer"));
		
		return memoryService.getMemoryByExample(probe);
	}

}
