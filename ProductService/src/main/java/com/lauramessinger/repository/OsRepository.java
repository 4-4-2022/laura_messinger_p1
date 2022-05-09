package com.lauramessinger.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lauramessinger.entity.Os;

@Repository
public interface OsRepository extends JpaRepository<Os, Integer> {

	List<Os> findAllByOrderByUidAsc();

}
