package com.cuder.service;

import java.util.List;

import com.cuder.model.Candidate;

public interface CandidateService {
	List<Candidate> getAllCandidate();

	Candidate findById(Integer id);
	
	Candidate createCandidate(Candidate candidate);

	Candidate updateCandidate(Candidate newCandidate, Integer id);

	void deleteCandidate(Integer id);

	Candidate acceptCandidate(Candidate c);
}
