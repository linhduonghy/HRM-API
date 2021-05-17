package com.cuder.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


/**
 * The persistent class for the title database table.
 * 
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Title implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String description;

	private String title_name;

	//bi-directional one-to-many association to Appointment
	@OneToMany(mappedBy="title")
	@JsonIgnore
	private List<Appointment> appointments;

	@OneToMany(mappedBy = "title")
	@JsonIgnore
	private List<RecruitmentPosition> recruitmentPositions;
	
	public Appointment addAppointment(Appointment appointment) {
		getAppointments().add(appointment);
		appointment.setTitle(this);

		return appointment;
	}

	public Appointment removeAppointment(Appointment appointment) {
		getAppointments().remove(appointment);
		appointment.setTitle(null);

		return appointment;
	}

}