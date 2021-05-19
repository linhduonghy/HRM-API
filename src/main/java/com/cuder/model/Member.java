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
	
	//bi-directional one-to-one association to Manager
	@OneToOne(mappedBy="member", cascade = CascadeType.ALL)
	@JsonIgnore
	private Manager manager;

	//bi-directional one-to-one association to Staff
	@OneToOne(mappedBy="member")
	@JsonIgnore
	private Staff staff;

	//bi-directional many-to-one association to Salary
	@OneToOne
	@JoinColumn(name = "salary_id")
	@JsonIgnoreProperties("member")
	private Salary salary;

	//bi-directional many-to-one association to TrainingCourse
	@OneToMany(mappedBy="member", cascade = CascadeType.ALL)
	private List<MemberTrainingCource> memberTraningCources;
}