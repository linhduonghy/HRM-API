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

import com.cuder.model.Manager;
import com.cuder.service.ManagerService;

@RestController
@CrossOrigin(value = "*")
@RequestMapping(value = "/manager")
public class ManagerController {

	@Autowired 
	ManagerService managerService;
	
	@GetMapping
	public List<Manager> getManagerList() {
		return managerService.getAllManager();
	}
	
	@GetMapping("/{id}")
	public Manager getById(@PathVariable Integer id) {
		return managerService.findById(id);
	}
	
	@PostMapping
	public Manager createManager(@RequestBody Manager manager) {
		return managerService.createManager(manager);
	}
	
	@PutMapping("/{id}")
	public Manager updateManager(@RequestBody Manager newManager, @PathVariable Integer id) {
		return managerService.updateManager(newManager, id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteManager(@PathVariable Integer id) {
		managerService.deleteManager(id);
	}
}
