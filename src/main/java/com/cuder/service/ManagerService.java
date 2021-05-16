package com.cuder.service;

import java.util.List;

import com.cuder.model.Manager;

public interface ManagerService {
	List<Manager> getAllManager();

	Manager findById(Integer id);
	
	Manager createManager(Manager manager);

	Manager updateManager(Manager newManager, Integer id);

	void deleteManager(Integer id);
}
