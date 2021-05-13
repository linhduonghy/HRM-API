package com.cuder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cuder.entities.Contract;

public interface ContractRepository extends JpaRepository<Contract, Integer>{
	
}
