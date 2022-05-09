package com.lauramessinger.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lauramessinger.entity.Cpu;
import com.lauramessinger.entity.Product;

@Repository
public interface CpuRepository extends JpaRepository<Product, Integer> {

	List<Cpu> findAllByOrderByUidAsc();
}
