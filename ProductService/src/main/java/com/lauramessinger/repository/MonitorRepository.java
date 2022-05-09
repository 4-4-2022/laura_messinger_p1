package com.lauramessinger.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lauramessinger.entity.Monitor;

@Repository
public interface MonitorRepository extends JpaRepository<Monitor, Integer> {

	List<Monitor> findAllByOrderByUidAsc();

}
