package com.cuder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cuder.model.Member;

public interface MemberRepository extends JpaRepository<Member, Integer>{
	
	Member findByUsername(String username);

	@Query(value = "SELECT * FROM hrm.member where member.username is null", nativeQuery = true)
	Member[] findMemberDontUsername();
}
