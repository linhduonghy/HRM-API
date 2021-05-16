package com.cuder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuder.model.Permission;
import com.cuder.repository.PermissionRepository;
import com.cuder.service.PermissionService;

@Service
public class PermissionServiceImpl implements PermissionService {

	@Autowired
	private PermissionRepository permissionRepo;

	@Override
	public List<Permission> getAllPermission() {
		return permissionRepo.findAll();
	}

	@Override
	public Permission findById(Integer id) {
		return permissionRepo.findById(id).map(a -> {
			return a;
		}).orElseGet(() -> {
			return null;
		});
	}
	
	@Override
	public Permission createPermission(Permission permission) {
		return permissionRepo.save(permission);
	}

	@Override
	public Permission updatePermission(Permission newPermission, Integer id) {
		Permission permission = findById(id);
		if (permission == null) {
			return null;
		}
		
		permission.setDescription(newPermission.getDescription());
		permission.setMemberPermissions(newPermission.getMemberPermissions());
		permission.setPermission_name(newPermission.getPermission_name());
		
		return permissionRepo.save(permission);
	}

	@Override
	public void deletePermission(Integer id) {
		
		permissionRepo.deleteById(id);
	}

}
