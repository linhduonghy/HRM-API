package com.cuder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cuder.model.Departmant;

public interface DepartmentRepository extends JpaRepository<Departmant, Integer>{

}
