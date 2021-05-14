package com.cuder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cuder.model.Degree;

public interface DegreeRepository extends JpaRepository<Degree, Integer>{
	
}
