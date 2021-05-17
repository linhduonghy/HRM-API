package com.cuder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuder.model.RecruitmentTerm;
import com.cuder.repository.RecruitmentTermRepository;
import com.cuder.service.RecruitmentTermService;

@Service
public class RecruitmentTermServiceImpl implements RecruitmentTermService {

	@Autowired
	private RecruitmentTermRepository recruimentTermRepo;

	@Override
	public List<RecruitmentTerm> getAllRecruitmentTerm() {
		return recruimentTermRepo.findAll();
	}

	@Override
	public RecruitmentTerm findById(Integer id) {
		return recruimentTermRepo.findById(id).map(a -> {
			return a;
		}).orElseGet(() -> {
			return null;
		});
	}
	
	@Override
	public RecruitmentTerm createRecruitmentTerm(RecruitmentTerm recruimentTerm) {
		return recruimentTermRepo.save(recruimentTerm);
	}

	@Override
	public RecruitmentTerm updateRecruitmentTerm(RecruitmentTerm newRecruitmentTerm, Integer id) {
		RecruitmentTerm recruimentTerm = findById(id);
		if (recruimentTerm == null) {
			return null;
		}
		
		recruimentTerm.setDescription(newRecruitmentTerm.getDescription());
		recruimentTerm.setEnd_date(newRecruitmentTerm.getEnd_date());
		recruimentTerm.setName(newRecruitmentTerm.getName());
		recruimentTerm.setRecruitmentPositions(newRecruitmentTerm.getRecruitmentPositions());
		recruimentTerm.setStart_date(newRecruitmentTerm.getStart_date());
		recruimentTerm.setStatus(newRecruitmentTerm.getStatus());
		
		return recruimentTermRepo.save(recruimentTerm);
	}

	@Override
	public void deleteRecruitmentTerm(Integer id) {
		
		recruimentTermRepo.deleteById(id);
	}

}
