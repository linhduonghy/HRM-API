package com.cuder.service;

import java.util.List;

import com.cuder.model.Manager;

public interface ManagerService {
	List<Manager> getAllManager();

	Manager findById(String id);
	
	Manager createManager(Manager manager);

	Manager updateManager(Manager newManager, String id);

	void deleteManager(String id);
}
