package com.lauramessinger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lauramessinger.entity.Cpu;
import com.lauramessinger.repository.CpuRepository;

@Service
public class CpuService {
	
	@Autowired
	private CpuRepository repo;
	
	public List<Cpu> findCpuByClockSpeed(float clockSpeed){
		return repo.findAllByClockSpeed(clockSpeed);
	}

}
