package com.cuder.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cuder.model.Member;
import com.cuder.service.MemberService;

@RestController
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@GetMapping
	public List<Member> getMemberList() {
		
		return memberService.getAllMember();
	}
	
	@PostMapping
	public Member addMember(@RequestBody Member member) {
		
		return memberService.addMember(member);
	}
}
