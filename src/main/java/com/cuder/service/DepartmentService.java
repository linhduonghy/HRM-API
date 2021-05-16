package com.cuder.service;

import java.util.List;

import com.cuder.model.Department;

public interface DepartmentService {

	Department findById(Integer d_id);
	
	List<Department> getAllDepartment();
	
	Department createDepartment(Department d);
	
	Department updateDepartment(Department newD, Integer d_id);
	
	void deleteDepartment(Integer d_id);
}
