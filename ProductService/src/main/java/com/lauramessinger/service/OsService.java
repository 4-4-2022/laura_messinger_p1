package com.lauramessinger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lauramessinger.repository.OsRepository;

@Service
public class OsService {
	
	@Autowired
	private OsRepository repo;
}
