package com.lauramessinger.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lauramessinger.entity.Cpu;
import com.lauramessinger.service.CpuService;

@RestController
public class CpuController {
	
	@Autowired
	private CpuService cpuService;
	

	@GetMapping(value = "/products/cpu")
	public List<Cpu> getAll() {	
		return cpuService.getCpu();
	}
	
	@PostMapping(value = "/products/cpu/search")
	@ResponseBody
	public List<Cpu> findCpu(@RequestParam Map<String, String> parameters){
		
		Cpu probe = new Cpu();
		
		probe.setCoreCount(Integer.parseInt(parameters.get("cores")));
		
		probe.setClockSpeed(Float.parseFloat(parameters.get("clockspeed")));
		
		probe.setIntegratedGraphics(Boolean.parseBoolean(parameters.get("integratedgraphics")));
		
		probe.setManufacturer(parameters.get("manufacturer"));
		
		return cpuService.getCpuByExample(probe);
	}
	
	
}