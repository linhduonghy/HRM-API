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

import com.cuder.model.BasicSalary;
import com.cuder.service.BasicSalaryService;

@RestController
@CrossOrigin(value = "*")
@RequestMapping(value = "/basicSalary")
public class BasicSalaryController {

	@Autowired 
	BasicSalaryService basicSalaryService;
	
	@GetMapping
	public List<BasicSalary> getBasicSalaryList() {
		return basicSalaryService.getAllBasicSalary();
	}
	
	@GetMapping("/{id}")
	public BasicSalary getById(@PathVariable Integer id) {
		return basicSalaryService.findById(id);
	}
	
	@PostMapping
	public BasicSalary createBasicSalary(@RequestBody BasicSalary basicSalary) {
		return basicSalaryService.createBasicSalary(basicSalary);
	}
	
	@PutMapping("/{id}")
	public BasicSalary updateBasicSalary(@RequestBody BasicSalary newBasicSalary, @PathVariable Integer id) {
		return basicSalaryService.updateBasicSalary(newBasicSalary, id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteBasicSalary(@PathVariable Integer id) {
		basicSalaryService.deleteBasicSalary(id);
	}
}
