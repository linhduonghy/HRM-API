package com.cuder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cuder.entities.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer>{

}
