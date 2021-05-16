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

import com.cuder.model.Member;
import com.cuder.service.MemberService;

@RestController
@CrossOrigin(value = "*")
@RequestMapping(value = "/member")
public class MemberController {

	@Autowired 
	MemberService memberService;
	
	@GetMapping
	public List<Member> getMemberList() {
		return memberService.getAllMember();
	}
	
	@GetMapping("/{id}")
	public Member getById(@PathVariable Integer id) {
		return memberService.findById(id);
	}
	
	@PostMapping
	public Member createMember(@RequestBody Member member) {
		return memberService.createMember(member);
	}
	
	@PutMapping("/{id}")
	public Member updateMember(@RequestBody Member newT, @PathVariable Integer id) {
		return memberService.updateMember(newT, id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteMember(@PathVariable Integer id) {
		memberService.deleteMember(id);
	}
	
}
