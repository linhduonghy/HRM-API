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

import com.cuder.model.ContractType;
import com.cuder.service.ContractTypeService;

@RestController
@CrossOrigin(value = "*")
@RequestMapping(value = "/contractType")
public class ContractTypeController {

	@Autowired 
	ContractTypeService contractTypeService;
	
	@GetMapping
	public List<ContractType> getContractTypeList() {
		return contractTypeService.getAllContractType();
	}
	
	@GetMapping("/{id}")
	public ContractType getById(@PathVariable Integer id) {
		return contractTypeService.findById(id);
	}
	
	@PostMapping
	public ContractType createContractType(@RequestBody ContractType contractType) {
		return contractTypeService.createContractType(contractType);
	}
	
	@PutMapping("/{id}")
	public ContractType updateContractType(@RequestBody ContractType newContractType, @PathVariable Integer id) {
		return contractTypeService.updateContractType(newContractType, id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteContractType(@PathVariable Integer id) {
		contractTypeService.deleteContractType(id);
	}
}
