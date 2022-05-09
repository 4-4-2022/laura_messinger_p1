package com.lauramessinger.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lauramessinger.entity.Gpu;

@Repository
public interface GpuRepository extends JpaRepository<Gpu, Integer> {

	List<Gpu> findAllByOrderByUidAsc();

}
