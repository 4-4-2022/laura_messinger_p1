package com.lauramessinger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.lauramessinger.entity.Gpu;
import com.lauramessinger.repository.GpuRepository;

@Service
public class GpuService {

	@Autowired
	private GpuRepository repo;

	public List<Gpu> getGpu() {
		return repo.findAllByOrderByUidAsc();
	}

	public List<Gpu> getCoolersByExample(Gpu probe) {
		return repo.findAll(Example.of(probe, ExampleMatcher.matchingAny().withIgnoreCase().withIgnoreNullValues()));
	}
	
}
