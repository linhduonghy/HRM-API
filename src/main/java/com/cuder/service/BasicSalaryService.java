package com.cuder.service;

import java.util.List;

import com.cuder.model.BasicSalary;

public interface BasicSalaryService{

	List<BasicSalary> getAllBasicSalary();

	BasicSalary findById(Integer id);
	
	BasicSalary createBasicSalary(BasicSalary basicSalary);

	BasicSalary updateBasicSalary(BasicSalary basicSalary, Integer id);

	void deleteBasicSalary(Integer id);
}
