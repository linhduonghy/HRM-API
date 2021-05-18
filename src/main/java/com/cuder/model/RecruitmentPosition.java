package com.cuder.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class RecruitmentPosition implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int number_of_recruitment;
	
	@ManyToOne
	@JsonIgnoreProperties("recruitmentPositions")
	private RecruitmentTerm recruitmentTerm;
	
	@ManyToOne
	private Title title;
	
	@OneToMany(mappedBy = "recruitmentPosition")
	private List<Candidate> candidates;
}
