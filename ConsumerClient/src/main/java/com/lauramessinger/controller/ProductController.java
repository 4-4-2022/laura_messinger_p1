package com.lauramessinger.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.lauramessinger.model.Account;
import com.lauramessinger.model.Product;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private ProductCommentHandler productCommentHandler;
	
	@GetMapping(value = "/all")
	public List<Product> getAll() {	
	
		ResponseEntity<Account[]> getAccounts = restTemplate.getForEntity("http://localhost:8082/accounts/all", Account[].class);
		
		List<Account> accountList = Arrays.asList(getAccounts.getBody());
		
		ResponseEntity<Product[]> getProducts = restTemplate.getForEntity("http://localhost:8081/products/all", Product[].class);
		
		List<Product> productList = Arrays.asList(getProducts.getBody());
		
		productCommentHandler.setProductComments(accountList, productList);
		
		return productList;
		
	}
	
	
	
}
