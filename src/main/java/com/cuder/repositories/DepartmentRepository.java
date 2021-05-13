package com.cuder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cuder.entities.Departmant;

public interface DepartmentRepository extends JpaRepository<Departmant, Integer>{

}
