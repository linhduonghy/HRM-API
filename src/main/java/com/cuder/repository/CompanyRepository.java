package com.cuder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cuder.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer>{

}
