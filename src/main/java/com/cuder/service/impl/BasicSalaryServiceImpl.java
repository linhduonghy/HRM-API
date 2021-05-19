package com.cuder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuder.model.BasicSalary;
import com.cuder.repository.BasicSalaryRepository;
import com.cuder.service.BasicSalaryService;

@Service
public class BasicSalaryServiceImpl implements BasicSalaryService {

	@Autowired
	private BasicSalaryRepository basicSalaryRepo;

	@Override
	public List<BasicSalary> getAllBasicSalary() {
		return basicSalaryRepo.findAll();
	}

	@Override
	public BasicSalary findById(String id) {
		return basicSalaryRepo.findById(id).map(a -> {
			return a;
		}).orElseGet(() -> {
			return null;
		});
	}
	
	@Override
	public BasicSalary createBasicSalary(BasicSalary basicSalary) {
		return basicSalaryRepo.save(basicSalary);
	}

	@Override
	public BasicSalary updateBasicSalary(BasicSalary newBasicSalary, String id) {
		BasicSalary basicSalary = findById(id);
		if (basicSalary == null) {
			return null;
		}

		basicSalary.setBasic_salary_value(newBasicSalary.getBasic_salary_value());
		basicSalary.setBasic_salary_name(newBasicSalary.getBasic_salary_name());
		basicSalary.setCreatedDate(newBasicSalary.getCreatedDate());
		basicSalary.setSalaries(newBasicSalary.getSalaries());
		
		return basicSalaryRepo.save(basicSalary);
	}

	@Override
	public void deleteBasicSalary(String id) {
		
		basicSalaryRepo.deleteById(id);
	}

}
