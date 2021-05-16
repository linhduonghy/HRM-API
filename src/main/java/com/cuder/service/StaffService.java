package com.cuder.service;

import java.util.List;

import com.cuder.model.Staff;

public interface StaffService {
	List<Staff> getAllStaff();

	Staff findById(Integer id);
	
	Staff createStaff(Staff staff);

	Staff updateStaff(Staff newStaff, Integer id);

	void deleteStaff(Integer id);
}
