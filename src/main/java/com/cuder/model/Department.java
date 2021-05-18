package com.cuder.model;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


/**
 * The persistent class for the departmant database table.
 * 
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String department_chief;

	private String department_name;

	private String phone;

	//bi-directional many-to-one association to Company
	@ManyToOne
	@JoinColumn(name="company_id")
	private Company company;

	//bi-directional one-to-many association to Staff
	@OneToMany(mappedBy="departmant", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Member> members;


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