package com.lauramessinger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.lauramessinger.entity.Memory;
import com.lauramessinger.repository.MemoryRepository;

@Service
public class MemoryService {

	@Autowired
	private MemoryRepository repo;

	public List<Memory> getMemory() {
		return repo.findAllByOrderByUidAsc();
	}

	public List<Memory> getMemoryByExample(Memory probe) {
		return repo.findAll(Example.of(probe, ExampleMatcher.matchingAny().withIgnoreCase().withIgnoreNullValues()));
	}
	
}
