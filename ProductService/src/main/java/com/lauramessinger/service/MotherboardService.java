package com.lauramessinger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.lauramessinger.entity.Motherboard;
import com.lauramessinger.repository.MotherboardRepository;

@Service
public class MotherboardService {

	@Autowired
	private MotherboardRepository repo;

	public List<Motherboard> getMobos() {

		return repo.findAllByOrderByUidAsc();
	}

	public List<Motherboard> getCoolersByExample(Motherboard probe) {
		return repo.findAll(Example.of(probe, ExampleMatcher.matchingAny().withIgnoreCase().withIgnoreNullValues()));
	}
	
}
