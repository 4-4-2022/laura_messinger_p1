package com.lauramessinger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatcher;
import org.springframework.stereotype.Service;

import com.lauramessinger.entity.CpuCooler;
import com.lauramessinger.repository.CpuCoolerRepository;

@Service
public class CpuCoolerService {
	
	@Autowired
	private CpuCoolerRepository repo;

	public List<CpuCooler> getCoolers() {
		return repo.findAllByOrderByUidAsc();
	}

	public List<CpuCooler> getCoolersByExample(CpuCooler probe) {
		return repo.findAll(Example.of(probe, ExampleMatcher.matchingAny().withIgnoreCase().withIgnoreNullValues()));
	}
}
