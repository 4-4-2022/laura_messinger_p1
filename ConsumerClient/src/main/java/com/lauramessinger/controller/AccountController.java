package com.lauramessinger.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.lauramessinger.model.Account;
import com.lauramessinger.model.AccountDto;
import com.lauramessinger.model.Comment;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping(value = "/all")
	public List<Account> getAll() {		
		ResponseEntity<Account[]> response = restTemplate.getForEntity("http://localhost:8082/accounts/all", Account[].class);
		
		List<Account> accountList = Arrays.asList(response.getBody());
		
		return accountList;
	}
	
	@PostMapping(value="/new")
	public void save(@RequestBody AccountDto request) {

		restTemplate.postForObject("http://localhost:8082/accounts/new", request, Account.class);
		
	}
	
	@PostMapping(value="/newcomment")
	public void save(@RequestBody Comment request) {
		restTemplate.postForObject("http://localhost:8082/accounts/newcomment", request, Comment.class);
	}
	
}
