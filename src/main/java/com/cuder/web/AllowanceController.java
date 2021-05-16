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

import com.cuder.model.Allowance;
import com.cuder.service.AllowanceService;

@RestController
@CrossOrigin(value = "*")
@RequestMapping(value = "/allowance")
public class AllowanceController {

	@Autowired 
	AllowanceService allowanceService;
	
	@GetMapping
	public List<Allowance> getAllowanceList() {
		return allowanceService.getAllAllowance();
	}
	
	@GetMapping("/{id}")
	public Allowance getById(@PathVariable Integer id) {
		return allowanceService.findById(id);
	}
	
	@PostMapping
	public Allowance createAllowance(@RequestBody Allowance allowance) {
		return allowanceService.createAllowance(allowance);
	}
	
	@PutMapping("/{id}")
	public Allowance updateAllowance(@RequestBody Allowance newT, @PathVariable Integer id) {
		return allowanceService.updateAllowance(newT, id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteAllowance(@PathVariable Integer id) {
		allowanceService.deleteAllowance(id);
	}
	
}
