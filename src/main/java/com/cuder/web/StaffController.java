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

import com.cuder.model.Staff;
import com.cuder.service.StaffService;

@RestController
@CrossOrigin(value = "*")
@RequestMapping(value = "/staff")
public class StaffController {

	@Autowired 
	StaffService staffService;
	
	@GetMapping
	public List<Staff> getStaffList() {
		return staffService.getAllStaff();
	}
	
	@GetMapping("/{id}")
	public Staff getById(@PathVariable Integer id) {
		return staffService.findById(id);
	}
	
	@PostMapping
	public Staff createStaff(@RequestBody Staff staff) {
		return staffService.createStaff(staff);
	}
	
	@PutMapping("/{id}")
	public Staff updateStaff(@RequestBody Staff newStaff, @PathVariable Integer id) {
		return staffService.updateStaff(newStaff, id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteStaff(@PathVariable Integer id) {
		staffService.deleteStaff(id);
	}
}
