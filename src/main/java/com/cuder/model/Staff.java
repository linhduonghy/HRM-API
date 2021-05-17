package com.cuder.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	//bi-directional one-to-many association to Appointment
	@OneToMany(mappedBy="staff")
	@JsonIgnore
	private List<Appointment> appointments;

	//bi-directional one-to-many association to Contract
	@OneToMany(mappedBy="staff")
	@JsonIgnore
	private List<Contract> contracts;

	//bi-directional one-to-one association to Member
	@OneToOne
	@JoinColumn(name="member_id")
	private Member member;

	public Appointment removeAppointment(Appointment appointment) {
		getAppointments().remove(appointment);
		appointment.setStaff(null);

		return appointment;
	}
	
}