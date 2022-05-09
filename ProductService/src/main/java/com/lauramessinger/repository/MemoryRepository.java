package com.lauramessinger.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lauramessinger.entity.Memory;

@Repository
public interface MemoryRepository extends JpaRepository<Memory, Integer> {

	List<Memory> findAllByOrderByUidAsc();

}
