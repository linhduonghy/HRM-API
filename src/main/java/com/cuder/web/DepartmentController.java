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

import com.cuder.model.Department;
import com.cuder.service.DepartmentService;

@RestController
@CrossOrigin(value = "*")
@RequestMapping(value = "/department")
public class DepartmentController {

	@Autowired 
	DepartmentService departmentService;
	
	@GetMapping
	public List<Department> getDepartmentList() {
		return departmentService.getAllDepartment();
	}
	
	@GetMapping("/{id}")
	public Department getById(@PathVariable Integer id) {
		return departmentService.findById(id);
	}
	
	@PostMapping
	public Department createDepartment(@RequestBody Department department) {
		return departmentService.createDepartment(department);
	}
	
	@PutMapping("/{id}")
	public Department updateDepartment(@RequestBody Department newDepartment, @PathVariable Integer id) {
		return departmentService.updateDepartment(newDepartment, id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteDepartment(@PathVariable Integer id) {
		departmentService.deleteDepartment(id);
	}
}
