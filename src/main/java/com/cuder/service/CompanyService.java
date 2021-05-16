package com.cuder.service;

import java.util.List;

import com.cuder.model.Company;

public interface CompanyService{

	List<Company> getAllCompany();

	Company addCompany(Company company);

	Company findById(Integer company_id);

	Company updateCompany(Company company, Integer company_id);

	void deleteCompany(Integer company_id);
	
}
