package com.cuder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cuder.entities.Salary;

public interface SalaryRepository extends JpaRepository<Salary, Integer>{

}
