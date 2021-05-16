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
		List<Company> companies = companyRepo.findAll();
		if (companies == null || companies.isEmpty()) {
			return null;
		}
		return companies;
	}

	@Override
	public Company addCompany(Company company) {

		// write the business logic
		// ...

		return companyRepo.save(company);
	}

	@Override
	public Company findById(Integer company_id) {
		return companyRepo.findById(company_id).map(company -> {
			return company;
		}).orElseGet(() -> {
			return null;
		});
	}

	@Override
	public Company updateCompany(Company newCompany, Integer company_id) {
		return companyRepo.findById(company_id).map( company -> {
			company.setCompany_name(newCompany.getCompany_name());
			company.setCompany_address(newCompany.getCompany_address());
			company.setCompany_phone(newCompany.getCompany_phone());
			company.setDescription(newCompany.getDescription());
			return companyRepo.save(company);
		}).orElseGet(() -> {
			return null;
		});
	}

	@Override
	public void deleteCompany(Integer company_id) {
		companyRepo.deleteById(company_id);
	}
	
	

}
