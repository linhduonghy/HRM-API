package com.cuder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuder.model.MemberTrainingCource;
import com.cuder.repository.MemberTrainingCourceRepository;
import com.cuder.service.MemberTrainingCourceService;

@Service
public class MemberTrainingCourceServiceImpl implements MemberTrainingCourceService {

	@Autowired
	private MemberTrainingCourceRepository memberTrainingCourceRepo;

	@Override
	public List<MemberTrainingCource> getAllMemberTrainingCource() {
		return memberTrainingCourceRepo.findAll();
	}

	@Override
	public MemberTrainingCource findById(Integer id) {
		return memberTrainingCourceRepo.findById(id).map(a -> {
			return a;
		}).orElseGet(() -> {
			return null;
		});
	}
	
	@Override
	public MemberTrainingCource createMemberTrainingCource(MemberTrainingCource memberTrainingCource) {
		return memberTrainingCourceRepo.save(memberTrainingCource);
	}

	@Override
	public MemberTrainingCource updateMemberTrainingCource(MemberTrainingCource newMemberTrainingCource, Integer id) {
		MemberTrainingCource memberTrainingCource = findById(id);
		if (memberTrainingCource == null) {
			return null;
		}
		
		memberTrainingCource.setMember(newMemberTrainingCource.getMember());
		memberTrainingCource.setTraining_start_date(newMemberTrainingCource.getTraining_start_date());
		memberTrainingCource.setTrainingCource(memberTrainingCource.getTrainingCource());
		
		return memberTrainingCourceRepo.save(memberTrainingCource);
	}

	@Override
	public void deleteMemberTrainingCource(Integer id) {
		
		memberTrainingCourceRepo.deleteById(id);
	}

}
