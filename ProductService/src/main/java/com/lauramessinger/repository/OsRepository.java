package com.lauramessinger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lauramessinger.entity.Os;

@Repository
public interface OsRepository extends JpaRepository<Os, Integer> {

}
