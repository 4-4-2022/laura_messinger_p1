package com.lauramessinger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.lauramessinger.entity.Monitor;
import com.lauramessinger.repository.MonitorRepository;

@Service
public class MonitorService {

	@Autowired
	private MonitorRepository repo;

	public List<Monitor> getMonitors() {

		return repo.findAllByOrderByUidAsc();
	}

	public List<Monitor> getCoolersByExample(Monitor probe) {
		return repo.findAll(Example.of(probe, ExampleMatcher.matchingAny().withIgnoreCase().withIgnoreNullValues()));
	}
	
}
