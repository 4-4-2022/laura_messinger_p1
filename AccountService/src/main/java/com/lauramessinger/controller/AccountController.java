package com.lauramessinger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lauramessinger.entity.Account;
import com.lauramessinger.entity.AccountDto;
import com.lauramessinger.entity.Comment;
import com.lauramessinger.entity.CommentDto;
import com.lauramessinger.entity.Credentials;
import com.lauramessinger.service.AccountService;
import com.lauramessinger.service.CommentService;

@RestController
@RequestMapping("/accounts")
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@Autowired
	private CommentService commentService;
	
	@GetMapping(value = "/all")
	public ResponseEntity<List<Account>> getAll() {		
		return new ResponseEntity<List<Account>>(accountService.getAll(), HttpStatus.OK);
	}
	
	@PostMapping(value="/new")
	public void save(@RequestBody AccountDto accountDto) {
		this.accountService.save(new Account(accountDto.getEmail(), new Credentials(accountDto.getUsername(), accountDto.getPassword())));
	}
	
	@PostMapping(value="/newcomment")
	public void save(@RequestBody Comment comment) {
		this.commentService.save(comment);
	}
}
