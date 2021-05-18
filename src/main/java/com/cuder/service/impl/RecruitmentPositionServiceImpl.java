package com.cuder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuder.model.RecruitmentPosition;
import com.cuder.repository.RecruitmentPositionRepository;
import com.cuder.service.RecruitmentPositionService;

@Service
public class RecruitmentPositionServiceImpl implements RecruitmentPositionService {

	@Autowired
	private RecruitmentPositionRepository recruitmentPositionRepo;

	@Override
	public List<RecruitmentPosition> getAllRecruitmentPosition() {
		return recruitmentPositionRepo.findAll();
	}

	@Override
	public RecruitmentPosition findById(Integer id) {
		return recruitmentPositionRepo.findById(id).map(a -> {
			return a;
		}).orElseGet(() -> {
			return null;
		});
	}
	
	@Override
	public RecruitmentPosition createRecruitmentPosition(RecruitmentPosition recruitmentPosition) {
		return recruitmentPositionRepo.save(recruitmentPosition);
	}

	@Override
	public RecruitmentPosition updateRecruitmentPosition(RecruitmentPosition newRecruitmentPosition, Integer id) {
		RecruitmentPosition recruitmentPosition = findById(id);
		if (recruitmentPosition == null) {
			return null;
		}
		
		recruitmentPosition.setCandidates(newRecruitmentPosition.getCandidates());
		recruitmentPosition.setNumber_of_recruitment(newRecruitmentPosition.getNumber_of_recruitment());
		recruitmentPosition.setRecruitmentTerm(newRecruitmentPosition.getRecruitmentTerm());
		recruitmentPosition.setTitle(newRecruitmentPosition.getTitle());
		
		return recruitmentPositionRepo.save(recruitmentPosition);
	}

	@Override
	public void deleteRecruitmentPosition(Integer id) {
		
		recruitmentPositionRepo.deleteById(id);
	}

	@Override
	public List<RecruitmentPosition> getPositionsInTerm(Integer term_id) {
		return recruitmentPositionRepo.getPositionsInTerm(term_id);
	}

}
