package com.cuder.model;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
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

	@Temporal(TemporalType.DATE)
	private Date dob;

	private String email;

	private String idcard;

	private String name;

	private String password;

	private String phone;

	private String sex;

	private String username;

	//bi-directional many-to-one association to Departmant
	@ManyToOne
	@JoinColumn(name = "department_id")
	private Departmant departmant;
	
	//bi-directional many-to-one association to Degree
	@OneToMany(mappedBy="member")
	private List<Degree> degrees;

	//bi-directional many-to-one association to Manager
	@OneToOne(mappedBy="member", cascade = CascadeType.ALL)
	private Manager manager;

	//bi-directional one-to-one association to Staff
	@OneToOne(mappedBy="member", cascade = CascadeType.ALL)
	private Staff staff;
		
	//bi-directional many-to-one association to Company
	@ManyToOne
	@JoinColumn(name = "company_id")
	private Company company;

	//bi-directional one-to-many association to MemberPermission
	@OneToMany(mappedBy="member", cascade = CascadeType.ALL)
	private List<MemberPermission> memberPermissions;

	//bi-directional many-to-one association to Salary
	@OneToOne
	@JoinColumn(name = "salary_id")
	private Salary salary;

	//bi-directional many-to-one association to TrainingCourse
	@OneToMany(mappedBy="member", cascade = CascadeType.ALL)
	private List<MemberTraningCource> memberTraningCources;

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



	public MemberTraningCource addMemberTrainingCources(MemberTraningCource mtc) {
		getMemberTraningCources().add(mtc);
		mtc.setMember(this);
		
		return mtc;
	}

	public MemberTraningCource removeMemberTrainingCources(MemberTraningCource mtc) {
		getMemberTraningCources().remove(mtc);
		mtc.setMember(null);
		
		return mtc;
	}
}