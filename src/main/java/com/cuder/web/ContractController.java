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

import com.cuder.model.Contract;
import com.cuder.service.ContractService;

@RestController
@CrossOrigin(value = "*")
@RequestMapping(value = "/contract")
public class ContractController {

	@Autowired 
	ContractService contractService;
	
	@GetMapping
	public List<Contract> getContractList() {
		return contractService.getAllContract();
	}
	
	@GetMapping("/{id}")
	public Contract getById(@PathVariable Integer id) {
		return contractService.findById(id);
	}
	
	@PostMapping
	public Contract createContract(@RequestBody Contract contract) {
		return contractService.createContract(contract);
	}
	
	@PutMapping("/{id}")
	public Contract updateContract(@RequestBody Contract newContract, @PathVariable Integer id) {
		return contractService.updateContract(newContract, id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteContract(@PathVariable Integer id) {
		contractService.deleteContract(id);
	}
}
