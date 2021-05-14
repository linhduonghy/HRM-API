package com.cuder.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the coefficientssalary database table.
 * 
 */
@Entity
public class CoefficientsSalary implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private float basicCS;

	private String typeSalary;

	//bi-directional many-to-one association to Salary
	@ManyToOne
	@JoinColumn(name="SalaryID")
	private Salary salary;

	public CoefficientsSalary() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getBasicCS() {
		return this.basicCS;
	}

	public void setBasicCS(float basicCS) {
		this.basicCS = basicCS;
	}

	public String getTypeSalary() {
		return this.typeSalary;
	}

	public void setTypeSalary(String typeSalary) {
		this.typeSalary = typeSalary;
	}

	public Salary getSalary() {
		return this.salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

}