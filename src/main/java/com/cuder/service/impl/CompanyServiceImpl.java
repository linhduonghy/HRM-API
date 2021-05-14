package com.cuder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuder.model.Company;
import com.cuder.repository.CompanyRepository;
import com.cuder.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyRepository companyRepo;
	
	@Override
	public List<Company> getAllCompany() {
	
		return companyRepo.findAll();
	}

	@Override
	public Company addCompany(Company company) {
		
		// write the business logic
		// ...
		
		return companyRepo.save(company); 
	}

}
