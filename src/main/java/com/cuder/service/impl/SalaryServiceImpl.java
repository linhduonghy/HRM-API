package com.cuder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuder.model.Salary;
import com.cuder.repository.SalaryRepository;
import com.cuder.service.SalaryService;

@Service
public class SalaryServiceImpl implements SalaryService {

	@Autowired
	private SalaryRepository salaryRepo;

	@Override
	public List<Salary> getAllSalary() {
		return salaryRepo.findAll();
	}

	@Override
	public Salary findById(Integer id) {
		return salaryRepo.findById(id).map(a -> {
			return a;
		}).orElseGet(() -> {
			return null;
		});
	}
	
	@Override
	public Salary createSalary(Salary salary) {
		return salaryRepo.save(salary);
	}

	@Override
	public Salary updateSalary(Salary newSalary, Integer id) {
		Salary salary = findById(id);
		if (salary == null) {
			return null;
		}
		
		salary.setAllowance(newSalary.getAllowance());
		salary.setBasicSalary(newSalary.getBasicSalary());
		salary.setBonus(newSalary.getBonus());
		salary.setJobType(newSalary.getJobType());
		salary.setMember(newSalary.getMember());
		salary.setSalary(newSalary.getSalary());
		
		return salaryRepo.save(salary);
	}

	@Override
	public void deleteSalary(Integer id) {
		
		salaryRepo.deleteById(id);
	}

}
