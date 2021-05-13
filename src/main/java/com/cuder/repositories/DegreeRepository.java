package com.cuder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cuder.entities.Degree;

public interface DegreeRepository extends JpaRepository<Degree, Integer>{
	
}
