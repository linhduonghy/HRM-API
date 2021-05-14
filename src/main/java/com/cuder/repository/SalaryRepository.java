package com.cuder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cuder.model.Salary;

public interface SalaryRepository extends JpaRepository<Salary, Integer>{

}
