package com.lauramessinger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.lauramessinger.entity.Psu;
import com.lauramessinger.repository.PsuRepository;

@Service
public class PsuService {

	@Autowired
	private PsuRepository repo;

	public List<Psu> getPsu() {

		return repo.findAllByOrderByUidAsc();
	}

	public List<Psu> getCoolersByExample(Psu probe) {
		return repo.findAll(Example.of(probe, ExampleMatcher.matchingAny().withIgnoreCase().withIgnoreNullValues()));
	}
}
