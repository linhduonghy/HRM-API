package com.cuder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cuder.model.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Integer>{

}
