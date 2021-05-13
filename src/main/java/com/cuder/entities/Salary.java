package com.cuder.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the salary database table.
 * 
 */
@Entity
@NamedQuery(name="Salary.findAll", query="SELECT s FROM Salary s")
public class Salary implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private float basicSalary;

	private String typeJob;

	//bi-directional many-to-one association to Allowance
	@OneToMany(mappedBy="salary")
	private List<Allowance> allowances;

	//bi-directional many-to-one association to Bonus
	@OneToMany(mappedBy="salary")
	private List<Bonus> bonuses;

	//bi-directional many-to-one association to Coefficientssalary
	@OneToMany(mappedBy="salary")
	private List<CoefficientsSalary> coefficientssalaries;

	//bi-directional many-to-one association to Member
	@OneToMany(mappedBy="salary")
	private List<Member> members;

	public Salary() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getBasicSalary() {
		return this.basicSalary;
	}

	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}

	public String getTypeJob() {
		return this.typeJob;
	}

	public void setTypeJob(String typeJob) {
		this.typeJob = typeJob;
	}

	public List<Allowance> getAllowances() {
		return this.allowances;
	}

	public void setAllowances(List<Allowance> allowances) {
		this.allowances = allowances;
	}

	public Allowance addAllowance(Allowance allowance) {
		getAllowances().add(allowance);
		allowance.setSalary(this);

		return allowance;
	}

	public Allowance removeAllowance(Allowance allowance) {
		getAllowances().remove(allowance);
		allowance.setSalary(null);

		return allowance;
	}

	public List<Bonus> getBonuses() {
		return this.bonuses;
	}

	public void setBonuses(List<Bonus> bonuses) {
		this.bonuses = bonuses;
	}

	public Bonus addBonus(Bonus bonus) {
		getBonuses().add(bonus);
		bonus.setSalary(this);

		return bonus;
	}

	public Bonus removeBonus(Bonus bonus) {
		getBonuses().remove(bonus);
		bonus.setSalary(null);

		return bonus;
	}

	public List<CoefficientsSalary> getCoefficientssalaries() {
		return this.coefficientssalaries;
	}

	public void setCoefficientssalaries(List<CoefficientsSalary> coefficientssalaries) {
		this.coefficientssalaries = coefficientssalaries;
	}

	public CoefficientsSalary addCoefficientssalary(CoefficientsSalary coefficientssalary) {
		getCoefficientssalaries().add(coefficientssalary);
		coefficientssalary.setSalary(this);

		return coefficientssalary;
	}

	public CoefficientsSalary removeCoefficientssalary(CoefficientsSalary coefficientssalary) {
		getCoefficientssalaries().remove(coefficientssalary);
		coefficientssalary.setSalary(null);

		return coefficientssalary;
	}

	public List<Member> getMembers() {
		return this.members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	public Member addMember(Member member) {
		getMembers().add(member);
		member.setSalary(this);

		return member;
	}

	public Member removeMember(Member member) {
		getMembers().remove(member);
		member.setSalary(null);

		return member;
	}

}