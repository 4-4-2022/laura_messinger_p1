package com.lauramessinger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lauramessinger.entity.Account;
import com.lauramessinger.service.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@GetMapping(value = "/all")
	public ResponseEntity<List<Account>> getAll() {		
		return new ResponseEntity<List<Account>>(accountService.getAll(), HttpStatus.OK);
	}
	
	
}
