package com.lauramessinger.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lauramessinger.entity.Psu;

@Repository
public interface PsuRepository extends JpaRepository<Psu, Integer> {

	List<Psu> findAllByOrderByUidAsc();

}
