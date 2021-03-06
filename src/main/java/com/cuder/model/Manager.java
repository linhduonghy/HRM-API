package com.cuder.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


/**
 * The persistent class for the manager database table.
 * 
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Manager implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private float years_of_experience;

	//bi-directional many-to-one association to Appointment
	@OneToMany(mappedBy="manager")
	private List<Appointment> appointments;

	//bi-directional one-to-many association to Contract
	@OneToMany(mappedBy="manager")
	private List<Contract> contracts;

	//bi-directional many-to-one association to Member
	@OneToOne
	@JoinColumn(name="member_id")
	@JsonIgnoreProperties("manager")
	private Member member;

	//bi-directional many-to-one association to Report
	@OneToMany(mappedBy="manager")
	private List<Report> reports;
}