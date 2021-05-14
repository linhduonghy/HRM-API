package com.cuder.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the departmant database table.
 * 
 */
@Entity
public class Departmant implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String generalinchief;

	private String nameDepartment;

	private String phone;

	//bi-directional many-to-one association to Company
	@ManyToOne
	@JoinColumn(name="CompanyID")
	private Company company;

	//bi-directional many-to-one association to Member
	@OneToMany(mappedBy="departmant")
	private List<Member> members;

	public Departmant() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGeneralinchief() {
		return this.generalinchief;
	}

	public void setGeneralinchief(String generalinchief) {
		this.generalinchief = generalinchief;
	}

	public String getNameDepartment() {
		return this.nameDepartment;
	}

	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = nameDepartment;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public List<Member> getMembers() {
		return this.members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	public Member addMember(Member member) {
		getMembers().add(member);
		member.setDepartmant(this);

		return member;
	}

	public Member removeMember(Member member) {
		getMembers().remove(member);
		member.setDepartmant(null);

		return member;
	}

}