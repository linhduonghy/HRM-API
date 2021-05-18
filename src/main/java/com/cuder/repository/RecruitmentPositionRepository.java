package com.cuder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cuder.model.RecruitmentPosition;

public interface RecruitmentPositionRepository extends JpaRepository<RecruitmentPosition, Integer> {
	@Query(value = "SELECT * FROM recruitment_position rp WHERE rp.recruitment_term_id = :term_id", nativeQuery = true)
	List<RecruitmentPosition> getPositionsInTerm(@Param("term_id") Integer term_id);

}
