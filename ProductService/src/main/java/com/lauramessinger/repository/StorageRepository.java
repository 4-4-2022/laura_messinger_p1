package com.lauramessinger.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lauramessinger.entity.Storage;

@Repository
public interface StorageRepository extends JpaRepository<Storage, Integer> {

	List<Storage> findAllByOrderByUidAsc();

}
