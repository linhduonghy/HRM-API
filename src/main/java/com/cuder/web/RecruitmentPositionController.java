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

import com.cuder.model.RecruitmentPosition;
import com.cuder.service.RecruitmentPositionService;

@RestController
@CrossOrigin(value = "*")
@RequestMapping(value = "/recruitment-position")
public class RecruitmentPositionController {

	@Autowired 
	RecruitmentPositionService recruitmentPositionService;
	
	@GetMapping
	public List<RecruitmentPosition> getRecruitmentPositionList() {
		return recruitmentPositionService.getAllRecruitmentPosition();
	}
	
	@GetMapping("term/{term_id}")
	public List<RecruitmentPosition> getPositionsInTerm(@PathVariable("term_id") Integer term_id) {
		return recruitmentPositionService.getPositionsInTerm(term_id);
	}
	
	@GetMapping("/{id}")
	public RecruitmentPosition getById(@PathVariable Integer id) {
		return recruitmentPositionService.findById(id);
	}
	
	@PostMapping
	public RecruitmentPosition createRecruitmentPosition(@RequestBody RecruitmentPosition recruitmentPosition) {
		return recruitmentPositionService.createRecruitmentPosition(recruitmentPosition);
	}
	
	@PutMapping("/{id}")
	public RecruitmentPosition updateRecruitmentPosition(@RequestBody RecruitmentPosition newRecruitmentPosition, @PathVariable Integer id) {
		return recruitmentPositionService.updateRecruitmentPosition(newRecruitmentPosition, id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteRecruitmentPosition(@PathVariable Integer id) {
		recruitmentPositionService.deleteRecruitmentPosition(id);
	}
}
