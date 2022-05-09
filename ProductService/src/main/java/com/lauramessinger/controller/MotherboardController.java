package com.lauramessinger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.lauramessinger.service.MotherboardService;
@RestController
public class MotherboardController {
	@Autowired
	private MotherboardService motherboardService;
}
