package com.cuder.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;


/**
 * The persistent class for the member database table.
 * 
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String address;

	private Date dob;

	private String email;

	private String idcard;

	private String name;

	private String password;

	private String phone;

	private String sex;

	private String username;
	
	private String qualification;

	//bi-directional many-to-one association to Departmant
	@ManyToOne
	@JoinColumn(name = "department_id")
	@JsonIgnoreProperties("members")
	private Department departmant;
	
	//bi-directional one-to-many association to Degree
	@OneToMany(mappedBy="member", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Degree> degrees;

	//bi-directional one-to-one association to Manager
	@OneToOne(mappedBy="member", cascade = CascadeType.ALL)
	@JsonIgnore
	private Manager manager;

	//bi-directional one-to-one association to Staff
	@OneToOne(mappedBy="member")
	@JsonIgnore
	private Staff staff;

	//bi-directional one-to-many association to MemberPermission
	@OneToMany(mappedBy="member", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<MemberPermission> memberPermissions;

	//bi-directional many-to-one association to Salary
	@OneToOne
	@JoinColumn(name = "salary_id")
	private Salary salary;

	//bi-directional many-to-one association to TrainingCourse
	@OneToMany(mappedBy="member", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<MemberTrainingCource> memberTraningCources;

	public MemberPermission addMemberPermission(MemberPermission memberPermission) {
		getMemberPermissions().add(memberPermission);
		memberPermission.setMember(this);

		return memberPermission;
	}

	public MemberPermission removeMemberPermission(MemberPermission memberPermission) {
		getMemberPermissions().remove(memberPermission);
		memberPermission.setMember(null);

		return memberPermission;
	}



	public MemberTrainingCource addMemberTrainingCources(MemberTrainingCource mtc) {
		getMemberTraningCources().add(mtc);
		mtc.setMember(this);
		
		return mtc;
	}

	public MemberTrainingCource removeMemberTrainingCources(MemberTrainingCource mtc) {
		getMemberTraningCources().remove(mtc);
		mtc.setMember(null);
		
		return mtc;
	}
}