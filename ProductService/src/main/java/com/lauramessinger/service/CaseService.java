package com.lauramessinger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.lauramessinger.entity.Case;
import com.lauramessinger.repository.CaseRepository;

@Service
public class CaseService {

	@Autowired
	private CaseRepository repo;
	
	public List<Case> getCases(){
		return repo.findAllByOrderByUidAsc();
	}
	
	public List<Case> getCasesByExample(Case searchedCase){
		return repo.findAll(Example.of(searchedCase, ExampleMatcher.matchingAny().withIgnoreCase().withIgnoreNullValues()));
	}
	
}
