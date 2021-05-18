package com.cuder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cuder.model.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Integer>{

	@Modifying
	@Query(value = "update candidate set status = 'accepted' where id=:id",nativeQuery = true)
	void acceptCandidate(@Param("id") Integer id);

}
