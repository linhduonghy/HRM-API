package com.cuder.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;


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

	private float salary;
	
	private Date createdDate;
	
	private float coefficientBasicSalary;
	
	//bi-directional one-to-one association to Allowance
	@ManyToOne
	@JoinColumn(name = "allowance_id")
	private Allowance allowance;

	//bi-directional one-to-one association to BasicSalary
	@ManyToOne
	@JoinColumn(name="basic_salary_id")
	private BasicSalary basicSalary;

	//bi-directional one-to-one association to Bonus
//	@OneToOne
//	@JoinColumn(name="bonus_id")
//	private Bonus bonus;

	//bi-directional many-to-one association to Member
	@ManyToOne
	private Member member;
	
	
}