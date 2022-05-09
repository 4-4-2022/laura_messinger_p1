package com.lauramessinger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lauramessinger.repository.CpuCoolerRepository;

@Service
public class CpuCoolerService {
	
	@Autowired
	private CpuCoolerRepository repo;
}
