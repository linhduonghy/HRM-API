package com.cuder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuder.model.Manager;
import com.cuder.repository.ManagerRepository;
import com.cuder.service.ManagerService;

@Service
public class ManagerServiceImpl implements ManagerService {

	@Autowired
	private ManagerRepository managerRepo;

	@Override
	public List<Manager> getAllManager() {
		return managerRepo.findAll();
	}

	@Override
	public Manager findById(Integer id) {
		return managerRepo.findById(id).map(a -> {
			return a;
		}).orElseGet(() -> {
			return null;
		});
	}
	
	@Override
	public Manager createManager(Manager manager) {
		return managerRepo.save(manager);
	}

	@Override
	public Manager updateManager(Manager newManager, Integer id) {
		Manager manager = findById(id);
		if (manager == null) {
			return null;
		}
		
		manager.setAppointments(newManager.getAppointments());
		manager.setContracts(newManager.getContracts());
		manager.setMember(newManager.getMember());
		manager.setReports(newManager.getReports());
		manager.setYears_of_experience(newManager.getYears_of_experience());
		
		return managerRepo.save(manager);
	}

	@Override
	public void deleteManager(Integer id) {
		
		managerRepo.deleteById(id);
	}

}
