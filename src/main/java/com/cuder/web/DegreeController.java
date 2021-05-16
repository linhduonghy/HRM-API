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

import com.cuder.model.Degree;
import com.cuder.service.DegreeService;

@RestController
@CrossOrigin(value = "*")
@RequestMapping(value = "/degree")
public class DegreeController {

	@Autowired 
	DegreeService degreeService;
	
	@GetMapping
	public List<Degree> getDegreeList() {
		return degreeService.getAllDegree();
	}
	
	@GetMapping("/{id}")
	public Degree getById(@PathVariable Integer id) {
		return degreeService.findById(id);
	}
	
	@PostMapping
	public Degree createDegree(@RequestBody Degree degree) {
		return degreeService.createDegree(degree);
	}
	
	@PutMapping("/{id}")
	public Degree updateDegree(@RequestBody Degree newDegree, @PathVariable Integer id) {
		return degreeService.updateDegree(newDegree, id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteDegree(@PathVariable Integer id) {
		degreeService.deleteDegree(id);
	}
}
