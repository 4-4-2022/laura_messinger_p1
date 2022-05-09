package com.lauramessinger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.lauramessinger.entity.Os;
import com.lauramessinger.repository.OsRepository;

@Service
public class OsService {
	
	@Autowired
	private OsRepository repo;

	public List<Os> getOs() {

		return repo.findAllByOrderByUidAsc();
	}

	public List<Os> getOsByExample(Os probe) {
		return repo.findAll(Example.of(probe, ExampleMatcher.matchingAny().withIgnoreCase().withIgnoreNullValues()));
	}
}
