package com.lauramessinger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lauramessinger.entity.Order;
import com.lauramessinger.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping(value = "/all")
	public ResponseEntity<List<Order>> getAll() {		
		return new ResponseEntity<List<Order>>(orderService.getAll(), HttpStatus.OK);
	}
	
	@PostMapping(value="/new")
	public void save(@RequestBody Order order) {
		this.orderService.save(order);
	}
	
	@DeleteMapping(value="/cancel")
	public void delete(@RequestBody Integer request) {
		this.orderService.deleteById(request);
	}
	
}
