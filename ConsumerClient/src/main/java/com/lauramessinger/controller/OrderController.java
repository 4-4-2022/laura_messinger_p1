package com.lauramessinger.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.lauramessinger.model.Order;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping(value = "/all")
	public List<Order> getAll() {		
		ResponseEntity<Order[]> response = restTemplate.getForEntity("http://localhost:8083/orders/all", Order[].class);

		List<Order> orderList = Arrays.asList(response.getBody());
		
		return orderList;
	}

}
