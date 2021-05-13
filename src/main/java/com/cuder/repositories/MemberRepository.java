package com.cuder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cuder.entities.Member;

public interface MemberRepository extends JpaRepository<Member, Integer>{

}
