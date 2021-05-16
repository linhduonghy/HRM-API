package com.cuder.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cuder.model.Company;
import com.cuder.service.CompanyService;

@RestController
@RequestMapping("/company")
@CrossOrigin(value = "*")
public class CompanyController {

	@Autowired
	private CompanyService companyService;
	
	@GetMapping
	public ResponseEntity<List<Company>> getCompanyList() {
		List<Company> companies = companyService.getAllCompany();
		if (companies == null) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Company>>(companies, HttpStatus.OK);
	}
	
	@GetMapping("/{company_id}")
	public ResponseEntity<Company> getCompany(@PathVariable Integer company_id) {
		Company company = companyService.findById(company_id);
		if (company == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Company>(company, HttpStatus.OK);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Company addCompany(@RequestBody Company company) {
		return companyService.addCompany(company);
	}
	
	@PutMapping("/{company_id}")
	public ResponseEntity<Company> updateCompany(@RequestBody Company newCompany, @PathVariable Integer company_id) {
		Company company = companyService.updateCompany(newCompany, company_id);
		if (company == null) {
			return new ResponseEntity<Company>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Company>(company, HttpStatus.OK);
	}
	
	@DeleteMapping("/{company_id}")
	public ResponseEntity<Company> deleteCompany(@PathVariable Integer company_id) {
		companyService.deleteCompany(company_id);
		return new ResponseEntity<Company>(HttpStatus.NO_CONTENT);
	}
}
