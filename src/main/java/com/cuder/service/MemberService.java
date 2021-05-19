package com.cuder.service;

import java.util.List;

import com.cuder.model.Member;

public interface MemberService {

	List<Member> getAllMember();

	Member findById(String id);
	
	Member createMember(Member member);
	
	Member getByUserName(String usrn);

	Member updateMember(Member newMember, String id);

	void deleteMember(String id);
	
}
