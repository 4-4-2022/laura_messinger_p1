package com.lauramessinger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lauramessinger.entity.Product;
import com.lauramessinger.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repo;
	
	public List<Product> getAll() {
		return repo.findAllByOrderByUidAsc();
	}
	
}
