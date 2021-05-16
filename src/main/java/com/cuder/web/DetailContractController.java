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

import com.cuder.model.DetailContract;
import com.cuder.service.DetailContractService;

@RestController
@CrossOrigin(value = "*")
@RequestMapping(value = "/detailContract")
public class DetailContractController {

	@Autowired 
	DetailContractService detailContractService;
	
	@GetMapping
	public List<DetailContract> getDetailContractList() {
		return detailContractService.getAllDetailContract();
	}
	
	@GetMapping("/{id}")
	public DetailContract getById(@PathVariable Integer id) {
		return detailContractService.findById(id);
	}
	
	@PostMapping
	public DetailContract createDetailContract(@RequestBody DetailContract detailContract) {
		return detailContractService.createDetailContract(detailContract);
	}
	
	@PutMapping("/{id}")
	public DetailContract updateDetailContract(@RequestBody DetailContract newDetailContract, @PathVariable Integer id) {
		return detailContractService.updateDetailContract(newDetailContract, id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteDetailContract(@PathVariable Integer id) {
		detailContractService.deleteDetailContract(id);
	}
}
