package com.lauramessinger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lauramessinger.repository.GpuRepository;

@Service
public class GpuService {

	@Autowired
	private GpuRepository repo;
	
}
