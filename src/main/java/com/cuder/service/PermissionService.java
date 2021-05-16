package com.cuder.service;

import java.util.List;

import com.cuder.model.Permission;

public interface PermissionService {
	List<Permission> getAllPermission();

	Permission findById(Integer id);
	
	Permission createPermission(Permission permission);

	Permission updatePermission(Permission newPermission, Integer id);

	void deletePermission(Integer id);
}
