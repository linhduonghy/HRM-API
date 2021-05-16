package com.cuder.service;

import java.util.List;

import com.cuder.model.MemberTrainingCource;

public interface MemberTrainingCourceService {
	List<MemberTrainingCource> getAllMemberTrainingCource();

	MemberTrainingCource findById(Integer id);
	
	MemberTrainingCource createMemberTrainingCource(MemberTrainingCource memberTrainingCource);

	MemberTrainingCource updateMemberTrainingCource(MemberTrainingCource newMemberTrainingCource, Integer id);

	void deleteMemberTrainingCource(Integer id);
}
