package com.cuder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuder.model.Member;
import com.cuder.repository.MemberRepository;
import com.cuder.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberRepository memberRepo;
	
	@Override
	public List<Member> getAllMember() {
		
		return memberRepo.findAll();
	}

	@Override
	public Member addMember(Member member) {
		
		// write the business logic 
		// ...
		
		return memberRepo.save(member);
	}

}
