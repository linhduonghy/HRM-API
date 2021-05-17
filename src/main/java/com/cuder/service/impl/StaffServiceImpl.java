package com.cuder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuder.model.Staff;
import com.cuder.repository.StaffRepository;
import com.cuder.service.StaffService;

@Service
public class StaffServiceImpl implements StaffService {

	@Autowired
	private StaffRepository staffRepo;

	@Override
	public List<Staff> getAllStaff() {
		return staffRepo.findAll();
	}

	@Override
	public Staff findById(Integer id) {
		return staffRepo.findById(id).map(a -> {
			return a;
		}).orElseGet(() -> {
			return null;
		});
	}
	
	@Override
	public Staff createStaff(Staff staff) {
		return staffRepo.save(staff);
	}

	@Override
	public Staff updateStaff(Staff newStaff, Integer id) {
		Staff staff = findById(id);
		if (staff == null) {
			return null;
		}
		
		staff.setAppointments(newStaff.getAppointments());
		staff.setContracts(newStaff.getContracts());
		staff.setMember(newStaff.getMember());
		
		return staffRepo.save(staff);
	}

	@Override
	public void deleteStaff(Integer id) {
		
		staffRepo.deleteById(id);
	}

}
