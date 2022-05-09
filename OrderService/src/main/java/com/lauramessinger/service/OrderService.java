package com.lauramessinger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lauramessinger.entity.Order;
import com.lauramessinger.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repo;
	
	public List<Order> getAll(){
		return repo.findAll();
	}

	public void save(Order order) {
		repo.save(order);
	}
	
	public void deleteById(int id) {
		repo.deleteById(id);
	}
	
}
