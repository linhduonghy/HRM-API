package com.cuder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cuder.model.Member;

public interface MemberRepository extends JpaRepository<Member, Integer>{

}
