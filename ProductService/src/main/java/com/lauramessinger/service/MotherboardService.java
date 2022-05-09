package com.lauramessinger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lauramessinger.repository.MotherboardRepository;

@Service
public class MotherboardService {

	@Autowired
	private MotherboardRepository repo;
	
}
