package com.cuder.model;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


/**
 * The persistent class for the staff database table.
 * 
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Staff implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	//bi-directional one-to-many association to Appointment
	@OneToMany(mappedBy="staff")
	private List<Appointment> appointments;

	//bi-directional one-to-many association to Contract
	@OneToMany(mappedBy="staff")
	private List<Contract> contracts;

	//bi-directional one-to-one association to Member
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="member_id")
	private Member member;
}