package com.cuder.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the allowance database table.
 * 
 */
@Entity
public class Allowance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private float levelOfAllowance;

	private String typeAllowance;

	//bi-directional many-to-one association to Salary
	@ManyToOne
	@JoinColumn(name="SalaryID")
	private Salary salary;

	public Allowance() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getLevelOfAllowance() {
		return this.levelOfAllowance;
	}

	public void setLevelOfAllowance(float levelOfAllowance) {
		this.levelOfAllowance = levelOfAllowance;
	}

	public String getTypeAllowance() {
		return this.typeAllowance;
	}

	public void setTypeAllowance(String typeAllowance) {
		this.typeAllowance = typeAllowance;
	}

	public Salary getSalary() {
		return this.salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

}