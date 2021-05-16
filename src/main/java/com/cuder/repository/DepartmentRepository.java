package com.cuder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cuder.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
