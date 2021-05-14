package com.cuder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cuder.model.Contract;

public interface ContractRepository extends JpaRepository<Contract, Integer>{
	
}
