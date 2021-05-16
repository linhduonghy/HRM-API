package com.cuder.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cuder.model.Salary;
import com.cuder.service.SalaryService;

@RestController
@CrossOrigin(value = "*")
@RequestMapping(value = "/salary")
public class SalaryController {

	@Autowired 
	SalaryService salaryService;
	
	@GetMapping
	public List<Salary> getSalaryList() {
		return salaryService.getAllSalary();
	}
	
	@GetMapping("/{id}")
	public Salary getById(@PathVariable Integer id) {
		return salaryService.findById(id);
	}
	
	@PostMapping
	public Salary createSalary(@RequestBody Salary salary) {
		return salaryService.createSalary(salary);
	}
	
	@PutMapping("/{id}")
	public Salary updateSalary(@RequestBody Salary newSalary, @PathVariable Integer id) {
		return salaryService.updateSalary(newSalary, id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteSalary(@PathVariable Integer id) {
		salaryService.deleteSalary(id);
	}
}
