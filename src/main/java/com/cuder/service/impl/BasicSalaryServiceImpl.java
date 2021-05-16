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
	public BasicSalary findById(Integer id) {
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
	public BasicSalary updateBasicSalary(BasicSalary newBasicSalary, Integer id) {
		BasicSalary basicSalary = findById(id);
		if (basicSalary == null) {
			return null;
		}

		basicSalary.setBasic_salary(newBasicSalary.getBasic_salary());
		basicSalary.setSalary(newBasicSalary.getSalary());
		
		return basicSalaryRepo.save(basicSalary);
	}

	@Override
	public void deleteBasicSalary(Integer id) {
		
		basicSalaryRepo.deleteById(id);
	}

}
