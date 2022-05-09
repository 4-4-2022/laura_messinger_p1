package com.lauramessinger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lauramessinger.repository.PsuRepository;

@Service
public class PsuService {

	@Autowired
	private PsuRepository repo;
}
