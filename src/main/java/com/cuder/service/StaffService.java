package com.cuder.service;

import java.util.List;

import com.cuder.model.Staff;

public interface StaffService {
	List<Staff> getAllStaff();

	Staff findById(String id);
	
	Staff createStaff(Staff staff);

	Staff updateStaff(Staff newStaff, String id);

	void deleteStaff(String id);
}
