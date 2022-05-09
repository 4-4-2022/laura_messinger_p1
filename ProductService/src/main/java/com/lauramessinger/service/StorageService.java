package com.lauramessinger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lauramessinger.repository.StorageRepository;

@Service
public class StorageService {
	
	@Autowired
	private StorageRepository repo;
	
}
