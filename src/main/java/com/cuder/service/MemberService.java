package com.cuder.service;

import java.util.List;

import com.cuder.model.Member;

public interface MemberService {

	List<Member> getAllMember();

	Member findById(Integer id);
	
	Member createMember(Member member);

	Member updateMember(Member newMember, Integer id);

	void deleteMember(Integer id);
	
}
