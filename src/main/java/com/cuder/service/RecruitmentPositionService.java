package com.cuder.service;

import java.util.List;

import com.cuder.model.RecruitmentPosition;

public interface RecruitmentPositionService {
	List<RecruitmentPosition> getAllRecruitmentPosition();

	RecruitmentPosition findById(Integer id);
	
	RecruitmentPosition createRecruitmentPosition(RecruitmentPosition recruitmentPosition);

	RecruitmentPosition updateRecruitmentPosition(RecruitmentPosition newRecruitmentPosition, Integer id);

	void deleteRecruitmentPosition(Integer id);

	List<RecruitmentPosition> getPositionsInTerm(Integer term_id);
}
