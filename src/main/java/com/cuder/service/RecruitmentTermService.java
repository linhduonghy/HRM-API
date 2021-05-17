package com.cuder.service;

import java.util.List;

import com.cuder.model.RecruitmentTerm;

public interface RecruitmentTermService {
	List<RecruitmentTerm> getAllRecruitmentTerm();

	RecruitmentTerm findById(Integer id);
	
	RecruitmentTerm createRecruitmentTerm(RecruitmentTerm recruitmentTerm);

	RecruitmentTerm updateRecruitmentTerm(RecruitmentTerm newRecruitmentTerm, Integer id);

	void deleteRecruitmentTerm(Integer id);
}
