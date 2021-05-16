package com.cuder.service;

import java.util.List;

import com.cuder.model.Salary;

public interface SalaryService {
	List<Salary> getAllSalary();

	Salary findById(Integer id);
	
	Salary createSalary(Salary salary);

	Salary updateSalary(Salary newSalary, Integer id);

	void deleteSalary(Integer id);
}
