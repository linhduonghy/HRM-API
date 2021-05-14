package com.cuder.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the bonus database table.
 * 
 */
@Entity
public class Bonus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private float bonuses;

	private String typeBonus;

	//bi-directional many-to-one association to Salary
	@ManyToOne
	@JoinColumn(name="SalaryID")
	private Salary salary;

	public Bonus() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getBonuses() {
		return this.bonuses;
	}

	public void setBonuses(float bonuses) {
		this.bonuses = bonuses;
	}

	public String getTypeBonus() {
		return this.typeBonus;
	}

	public void setTypeBonus(String typeBonus) {
		this.typeBonus = typeBonus;
	}

	public Salary getSalary() {
		return this.salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

}