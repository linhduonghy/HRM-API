package com.cuder.model;

import java.io.Serializable;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



/**
 * The persistent class for the salary database table.
 * 
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Salary implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="job_type")
	private String jobType;

	private float salary;

	//bi-directional one-to-one association to Allowance
	@OneToOne
	@JoinColumn(name = "allowance_id")
	private Allowance allowance;

	//bi-directional one-to-one association to BasicSalary
	@OneToOne
	@JoinColumn(name="basic_salary_id")
	private BasicSalary basicSalary;

	//bi-directional one-to-one association to Bonus
	@OneToOne
	@JoinColumn(name="bonus_id")
	private Bonus bonus;

	//bi-directional many-to-one association to Member
	@OneToOne(mappedBy = "salary", orphanRemoval = true)
	@JsonIgnore
	private Member member;
	
	
}