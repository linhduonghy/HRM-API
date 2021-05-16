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

import com.cuder.model.MemberPermission;
import com.cuder.service.MemberPermissionService;

@RestController
@CrossOrigin(value = "*")
@RequestMapping(value = "/memberPermission")
public class MemberPermissionController {

	@Autowired 
	MemberPermissionService memberPermissionService;
	
	@GetMapping
	public List<MemberPermission> getMemberPermissionList() {
		return memberPermissionService.getAllMemberPermission();
	}
	
	@GetMapping("/{id}")
	public MemberPermission getById(@PathVariable Integer id) {
		return memberPermissionService.findById(id);
	}
	
	@PostMapping
	public MemberPermission createMemberPermission(@RequestBody MemberPermission memberPermission) {
		return memberPermissionService.createMemberPermission(memberPermission);
	}
	
	@PutMapping("/{id}")
	public MemberPermission updateMemberPermission(@RequestBody MemberPermission newMemberPermission, @PathVariable Integer id) {
		return memberPermissionService.updateMemberPermission(newMemberPermission, id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteMemberPermission(@PathVariable Integer id) {
		memberPermissionService.deleteMemberPermission(id);
	}
}
