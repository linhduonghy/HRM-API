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
	public Member findById(Integer id) {
		return memberRepo.findById(id).map(a -> {
			return a;
		}).orElseGet(() -> {
			return null;
		});
	}
	
	@Override
	public Member createMember(Member member) {
		return memberRepo.save(member);
	}

	@Override
	public Member updateMember(Member newMember, Integer id) {
		Member member = findById(id);
		if (member == null) {
			return null;
		}
		
		member.setAddress(newMember.getAddress());
		member.setDegrees(newMember.getDegrees());
		member.setDepartmant(newMember.getDepartmant());
		member.setDob(newMember.getDob());
		member.setEmail(newMember.getEmail());
		member.setIdcard(newMember.getIdcard());
		member.setManager(newMember.getManager());
		member.setMemberPermissions(newMember.getMemberPermissions());
		member.setMemberTraningCources(newMember.getMemberTraningCources());
		member.setName(newMember.getName());
		member.setPassword(newMember.getPassword());
		member.setPhone(newMember.getPhone());
		member.setSalary(newMember.getSalary());
		member.setSex(newMember.getSex());
		member.setStaff(newMember.getStaff());
		member.setUsername(newMember.getUsername());
		
		return memberRepo.save(member);
	}

	@Override
	public void deleteMember(Integer id) {
		
		memberRepo.deleteById(id);
	}

}
