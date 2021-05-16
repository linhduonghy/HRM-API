package com.cuder.service;

import java.util.List;

import com.cuder.model.MemberPermission;

public interface MemberPermissionService {
	List<MemberPermission> getAllMemberPermission();

	MemberPermission findById(Integer id);
	
	MemberPermission createMemberPermission(MemberPermission memberPermission);

	MemberPermission updateMemberPermission(MemberPermission newMemberPermission, Integer id);

	void deleteMemberPermission(Integer id);
	
}
