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

import com.cuder.model.RecruitmentTerm;
import com.cuder.service.RecruitmentTermService;

@RestController
@CrossOrigin(value = "*")
@RequestMapping(value = "/recruitment-term")
public class RecruitmentTermController {

	@Autowired 
	RecruitmentTermService recruitmentTermService;
	
	@GetMapping
	public List<RecruitmentTerm> getRecruitmentTermList() {
		return recruitmentTermService.getAllRecruitmentTerm();
	}
	
	@GetMapping("/{id}")
	public RecruitmentTerm getById(@PathVariable Integer id) {
		return recruitmentTermService.findById(id);
	}
	
	@PostMapping
	public RecruitmentTerm createRecruitmentTerm(@RequestBody RecruitmentTerm recruitmentTerm) {
		return recruitmentTermService.createRecruitmentTerm(recruitmentTerm);
	}
	
	@PutMapping("/{id}")
	public RecruitmentTerm updateRecruitmentTerm(@RequestBody RecruitmentTerm newRecruitmentTerm, @PathVariable Integer id) {
		return recruitmentTermService.updateRecruitmentTerm(newRecruitmentTerm, id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteRecruitmentTerm(@PathVariable Integer id) {
		recruitmentTermService.deleteRecruitmentTerm(id);
	}
}
