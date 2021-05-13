package com.cuder.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the company database table.
 * 
 */
@Entity
@NamedQuery(name="Company.findAll", query="SELECT c FROM Company c")
public class Company implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String address;

	private String description;

	private String nameCompany;

	private String phone;

	//bi-directional many-to-one association to Departmant
	@OneToMany(mappedBy="company")
	private List<Departmant> departmants;

	//bi-directional many-to-one association to Member
	@OneToMany(mappedBy="company")
	private List<Member> members;

	public Company() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNameCompany() {
		return this.nameCompany;
	}

	public void setNameCompany(String nameCompany) {
		this.nameCompany = nameCompany;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Departmant> getDepartmants() {
		return this.departmants;
	}

	public void setDepartmants(List<Departmant> departmants) {
		this.departmants = departmants;
	}

	public Departmant addDepartmant(Departmant departmant) {
		getDepartmants().add(departmant);
		departmant.setCompany(this);

		return departmant;
	}

	public Departmant removeDepartmant(Departmant departmant) {
		getDepartmants().remove(departmant);
		departmant.setCompany(null);

		return departmant;
	}

	public List<Member> getMembers() {
		return this.members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	public Member addMember(Member member) {
		getMembers().add(member);
		member.setCompany(this);

		return member;
	}

	public Member removeMember(Member member) {
		getMembers().remove(member);
		member.setCompany(null);

		return member;
	}

}