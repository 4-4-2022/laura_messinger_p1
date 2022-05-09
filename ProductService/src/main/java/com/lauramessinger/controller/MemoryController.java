package com.lauramessinger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.lauramessinger.service.MemoryService;
@RestController
public class MemoryController {
	@Autowired
	private MemoryService memoryService;
}
