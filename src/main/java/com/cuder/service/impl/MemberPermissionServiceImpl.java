package com.cuder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuder.model.MemberPermission;
import com.cuder.repository.MemberPermissionRepository;
import com.cuder.service.MemberPermissionService;

@Service
public class MemberPermissionServiceImpl implements MemberPermissionService {

	@Autowired
	private MemberPermissionRepository memberPermissionRepo;

	@Override
	public List<MemberPermission> getAllMemberPermission() {
		return memberPermissionRepo.findAll();
	}

	@Override
	public MemberPermission findById(Integer id) {
		return memberPermissionRepo.findById(id).map(a -> {
			return a;
		}).orElseGet(() -> {
			return null;
		});
	}
	
	@Override
	public MemberPermission createMemberPermission(MemberPermission memberPermission) {
		return memberPermissionRepo.save(memberPermission);
	}

	@Override
	public MemberPermission updateMemberPermission(MemberPermission newMemberPermission, Integer id) {
		MemberPermission memberPermission = findById(id);
		if (memberPermission == null) {
			return null;
		}
		
		memberPermission.setMember(newMemberPermission.getMember());
		memberPermission.setPermission(newMemberPermission.getPermission());
		
		return memberPermissionRepo.save(memberPermission);
	}

	@Override
	public void deleteMemberPermission(Integer id) {
		
		memberPermissionRepo.deleteById(id);
	}

}
