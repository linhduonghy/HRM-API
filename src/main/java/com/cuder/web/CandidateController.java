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

import com.cuder.model.Candidate;
import com.cuder.service.CandidateService;

@RestController
@CrossOrigin(value = "*")
@RequestMapping(value = "/recruitment/candidate")
public class CandidateController {

	@Autowired 
	CandidateService candidateService;
	
	@GetMapping
	public List<Candidate> getCandidateList() {
		return candidateService.getAllCandidate();
	}
	
	@GetMapping("/{id}")
	public Candidate getById(@PathVariable Integer id) {
		return candidateService.findById(id);
	}
	
	@PostMapping
	public Candidate createCandidate(@RequestBody Candidate candidate) {
		return candidateService.createCandidate(candidate);
	}
	
	@PutMapping("/{id}")
	public Candidate updateCandidate(@RequestBody Candidate newCandidate, @PathVariable Integer id) {
		return candidateService.updateCandidate(newCandidate, id);
	}
	
	@PostMapping("/accept")
	public Candidate acceptCandidate(@RequestBody Candidate c) {
		return candidateService.acceptCandidate(c);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCandidate(@PathVariable Integer id) {
		candidateService.deleteCandidate(id);
	}

}
