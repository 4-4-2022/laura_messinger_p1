package com.lauramessinger.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lauramessinger.entity.Motherboard;

@Repository
public interface MotherboardRepository extends JpaRepository<Motherboard, Integer> {

	List<Motherboard> findAllByOrderByUidAsc();

}
