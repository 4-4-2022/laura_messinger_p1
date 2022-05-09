package com.lauramessinger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lauramessinger.repository.MonitorRepository;

@Service
public class MonitorService {

	@Autowired
	private MonitorRepository repo;
	
}
