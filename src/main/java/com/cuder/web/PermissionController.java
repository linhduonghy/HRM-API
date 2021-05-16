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

import com.cuder.model.Permission;
import com.cuder.service.PermissionService;

@RestController
@CrossOrigin(value = "*")
@RequestMapping(value = "/permission")
public class PermissionController {

	@Autowired 
	PermissionService permissionService;
	
	@GetMapping
	public List<Permission> getPermissionList() {
		return permissionService.getAllPermission();
	}
	
	@GetMapping("/{id}")
	public Permission getById(@PathVariable Integer id) {
		return permissionService.findById(id);
	}
	
	@PostMapping
	public Permission createPermission(@RequestBody Permission permission) {
		return permissionService.createPermission(permission);
	}
	
	@PutMapping("/{id}")
	public Permission updatePermission(@RequestBody Permission newPermission, @PathVariable Integer id) {
		return permissionService.updatePermission(newPermission, id);
	}
	
	@DeleteMapping("/{id}")
	public void deletePermission(@PathVariable Integer id) {
		permissionService.deletePermission(id);
	}
}
