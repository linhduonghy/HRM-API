package com.cuder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuder.model.Candidate;
import com.cuder.repository.CandidateRepository;
import com.cuder.service.CandidateService;

@Service
public class CandidateServiceImpl implements CandidateService {

	@Autowired
	private CandidateRepository candidateRepo;

	@Override
	public List<Candidate> getAllCandidate() {
		return candidateRepo.findAll();
	}

	@Override
	public Candidate findById(Integer id) {
		return candidateRepo.findById(id).map(a -> {
			return a;
		}).orElseGet(() -> {
			return null;
		});
	}
	
	@Override
	public Candidate createCandidate(Candidate candidate) {
		return candidateRepo.save(candidate);
	}

	@Override
	public Candidate updateCandidate(Candidate newCandidate, Integer id) {
		Candidate candidate = findById(id);
		if (candidate == null) {
			return null;
		}
		
		candidate.setStatus(newCandidate.getStatus());
		candidate.setAddress(newCandidate.getAddress());
		candidate.setDob(newCandidate.getDob());
		candidate.setEmail(newCandidate.getEmail());
		candidate.setIdcard(newCandidate.getIdcard());
		candidate.setName(newCandidate.getName());
		candidate.setPhone(newCandidate.getPhone());
		candidate.setRecruitmentPosition(newCandidate.getRecruitmentPosition());
		candidate.setSex(newCandidate.getSex());
		
		return candidateRepo.save(candidate);
	}

	@Override
	public void deleteCandidate(Integer id) {
		
		candidateRepo.deleteById(id);
	}

	@Override
	public Candidate acceptCandidate(Candidate c) {
		c = findById(c.getId());
		c.setStatus("accepted");
		return candidateRepo.save(c);
	}

}
