package com.lauramessinger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lauramessinger.entity.Product;
import com.lauramessinger.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping(value = "/products/all")
	public ResponseEntity<List<Product>> getAll() {	
		return new ResponseEntity<List<Product>>(productService.getAll(), HttpStatus.OK);
	}
	
}