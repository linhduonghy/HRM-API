package com.cuder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuder.model.Department;
import com.cuder.repository.DepartmentRepository;
import com.cuder.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired 
	private DepartmentRepository departmentRepo;
	
	@Override
	public Department findById(Integer d_id) {
		return departmentRepo.findById(d_id).map( d -> {
			return d;
		}).orElseGet( () -> {
			return null;
		});
	}

	@Override
	public List<Department> getAllDepartment() {
		return departmentRepo.findAll();
	}

	@Override
	public Department createDepartment(Department d) {
		return departmentRepo.save(d);
	}

	@Override
	public Department updateDepartment(Department newD, Integer d_id) {
		Department d = findById(d_id);
		if (d == null)
			return null;
		
		d.setCompany(newD.getCompany());
		d.setDepartment_chief(newD.getDepartment_chief());
		d.setDepartment_name(d.getDepartment_name());
		d.setMembers(newD.getMembers());
		d.setPhone(newD.getPhone());
		
		return departmentRepo.save(d);
		
	}

	@Override
	public void deleteDepartment(Integer d_id) {
		
		departmentRepo.deleteById(d_id);
	}

}
