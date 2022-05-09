package com.lauramessinger.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lauramessinger.entity.Monitor;
import com.lauramessinger.service.MonitorService;
@RestController
public class MonitorController {
	@Autowired
	private MonitorService monitorService;
	
	@GetMapping(value = "/products/monitors")
	public List<Monitor> getAll() {	
		return monitorService.getMonitors();
	}
	
	@GetMapping(value = "/products/monitors/search")
	public List<Monitor> findMonitors(@RequestParam Map<String, String> parameters){
		
		Monitor probe = new Monitor();
		probe.setManufacturer(parameters.get("manufacturer"));
		
		return monitorService.getCoolersByExample(probe);
	}
}
