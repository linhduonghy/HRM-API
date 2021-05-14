package com.cuder.service;

import java.util.List;

import com.cuder.model.Company;

public interface CompanyService{

	List<Company> getAllCompany();

	Company addCompany(Company company);
}
