package com.cuder.service;

import java.util.List;

import com.cuder.model.Member;

public interface MemberService {

	List<Member> getAllMember();

	Member addMember(Member member);
	
}
