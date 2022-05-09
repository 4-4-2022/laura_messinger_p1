package com.lauramessinger.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lauramessinger.entity.Storage;
import com.lauramessinger.service.StorageService;
@RestController
public class StorageController {
	@Autowired
	private StorageService storageService;
	

	
	@GetMapping(value = "/products/storage")
	public List<Storage> getAll() {	
		return storageService.getStorage();
	}
	
	
	@PostMapping(value = "/products/storage/search")
	@ResponseBody
	public List<Storage> findStorage(@RequestParam Map<String, String> parameters){
		
		Storage probe = new Storage();
		probe.setManufacturer(parameters.get("manufacturer"));
		
		return storageService.getStorageByExample(probe);
	}
}
