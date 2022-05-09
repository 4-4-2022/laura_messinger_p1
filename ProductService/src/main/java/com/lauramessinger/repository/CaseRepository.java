package com.lauramessinger.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lauramessinger.entity.Case;

@Repository
public interface CaseRepository extends JpaRepository<Case, Integer> {

	List<Case> findAllByOrderByUidAsc();

	
	
}
