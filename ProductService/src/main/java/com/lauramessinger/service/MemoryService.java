package com.lauramessinger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lauramessinger.repository.MemoryRepository;

@Service
public class MemoryService {

	@Autowired
	private MemoryRepository repo;
	
}
