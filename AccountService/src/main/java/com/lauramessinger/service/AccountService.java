package com.lauramessinger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lauramessinger.entity.Account;
import com.lauramessinger.repository.AccountRepository;

@Service("accountService")
public class AccountService {

	private AccountRepository accountRepository;
	
	@Autowired
	public void setAccountRepository(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}
	
	public List<Account> getAll(){
		return accountRepository.findAll();
	}

	public void save(Account account) {
		accountRepository.save(account);
	}
	
}
