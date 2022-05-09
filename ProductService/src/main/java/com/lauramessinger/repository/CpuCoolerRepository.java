package com.lauramessinger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lauramessinger.entity.CpuCooler;

@Repository
public interface CpuCoolerRepository extends JpaRepository<CpuCooler, Integer> {

}
