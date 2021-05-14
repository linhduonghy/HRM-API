package com.cuder.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cuder.model.Company;
import com.cuder.service.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyController {

	@Autowired
	private CompanyService companyService;
	
	@GetMapping
	public List<Company> getCompanyList() {
		
		return companyService.getAllCompany();
	}
}
