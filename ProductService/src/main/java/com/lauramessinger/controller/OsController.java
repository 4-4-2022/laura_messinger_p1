package com.lauramessinger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.lauramessinger.service.OsService;
@RestController
public class OsController {
	@Autowired
	private OsService osService;
}
