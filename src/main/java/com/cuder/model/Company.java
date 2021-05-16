package com.cuder.model;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


/**
 * The persistent class for the company database table.
 * 
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String company_address;

	private String company_name;

	private String company_phone;

	private String description;

	//bi-directional many-to-one association to Departmant
	@OneToMany(mappedBy="company", cascade = CascadeType.ALL)
	private List<Departmant> departmants;

	//bi-directional many-to-one association to Member
	@OneToMany(mappedBy="company", cascade = CascadeType.ALL)
	private List<Member> members;

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