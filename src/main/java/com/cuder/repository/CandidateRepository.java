package com.cuder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cuder.model.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Integer>{

	@Query(value = "update candidate set status = 'accepted' where id=?1",nativeQuery = true)
	void acceptCandidate(Integer id);

}
