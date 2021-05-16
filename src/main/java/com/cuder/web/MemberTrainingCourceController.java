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

import com.cuder.model.MemberTrainingCource;
import com.cuder.service.MemberTrainingCourceService;

@RestController
@CrossOrigin(value = "*")
@RequestMapping(value = "/memberTrainingCource")
public class MemberTrainingCourceController {

	@Autowired 
	MemberTrainingCourceService memberTrainingCourceService;
	
	@GetMapping
	public List<MemberTrainingCource> getMemberTrainingCourceList() {
		return memberTrainingCourceService.getAllMemberTrainingCource();
	}
	
	@GetMapping("/{id}")
	public MemberTrainingCource getById(@PathVariable Integer id) {
		return memberTrainingCourceService.findById(id);
	}
	
	@PostMapping
	public MemberTrainingCource createMemberTrainingCource(@RequestBody MemberTrainingCource memberTrainingCource) {
		return memberTrainingCourceService.createMemberTrainingCource(memberTrainingCource);
	}
	
	@PutMapping("/{id}")
	public MemberTrainingCource updateMemberTrainingCource(@RequestBody MemberTrainingCource newMemberTrainingCource, @PathVariable Integer id) {
		return memberTrainingCourceService.updateMemberTrainingCource(newMemberTrainingCource, id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteMemberTrainingCource(@PathVariable Integer id) {
		memberTrainingCourceService.deleteMemberTrainingCource(id);
	}
}
