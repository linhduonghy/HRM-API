package com.cuder.service;

import java.util.List;

import com.cuder.model.BasicSalary;

public interface BasicSalaryService{

	List<BasicSalary> getAllBasicSalary();

	BasicSalary findById(String id);
	
	BasicSalary createBasicSalary(BasicSalary basicSalary);

	BasicSalary updateBasicSalary(BasicSalary basicSalary, String id);

	void deleteBasicSalary(String id);
}
