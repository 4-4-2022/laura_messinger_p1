package com.lauramessinger.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lauramessinger.entity.Case;
import com.lauramessinger.repository.CaseRepository;

@Service
public class CaseService {

	@Autowired
	private CaseRepository repo;
	
	public List<Case> getCase(){
		return repo.findAllByOrderByUidAsc();
	}
	
}
