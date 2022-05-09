package com.lauramessinger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.lauramessinger.entity.Storage;
import com.lauramessinger.repository.StorageRepository;

@Service
public class StorageService {
	
	@Autowired
	private StorageRepository repo;

	public List<Storage> getStorage() {

		return repo.findAllByOrderByUidAsc();
	}

	public List<Storage> getStorageByExample(Storage probe) {
		return repo.findAll(Example.of(probe, ExampleMatcher.matchingAny().withIgnoreCase().withIgnoreNullValues()));
	}
	
}
