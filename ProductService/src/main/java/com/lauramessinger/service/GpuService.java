package com.lauramessinger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lauramessinger.entity.Gpu;
import com.lauramessinger.repository.GpuRepository;

@Service
public class GpuService {

	@Autowired
	private GpuRepository repo;

	public List<Gpu> getGpu() {
		return repo.findAllByOrderByUidAsc();
	}
	
}
