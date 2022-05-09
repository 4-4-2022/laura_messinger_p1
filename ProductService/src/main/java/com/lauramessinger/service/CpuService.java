package com.lauramessinger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.lauramessinger.entity.Cpu;
import com.lauramessinger.repository.CpuRepository;

@Service
public class CpuService {
	
	@Autowired
	private CpuRepository repo;

	public List<Cpu> getCpu() {
		return repo.findAllByOrderByUidAsc();
	}

	public List<Cpu> getCpuByExample(Cpu probe) {
		return repo.findAll(Example.of(probe, ExampleMatcher.matchingAny().withIgnoreCase().withIgnoreNullValues()));
	}
	
}
