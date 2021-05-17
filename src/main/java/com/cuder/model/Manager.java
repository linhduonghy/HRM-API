package com.cuder.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private float years_of_experience;

	//bi-directional many-to-one association to Appointment
	@OneToMany(mappedBy="manager")
	@JsonIgnore
	private List<Appointment> appointments;

	//bi-directional one-to-many association to Contract
	@OneToMany(mappedBy="manager")
	@JsonIgnore
	private List<Contract> contracts;

	//bi-directional many-to-one association to Member
	@OneToOne
	@JoinColumn(name="member_id")
	private Member member;

	//bi-directional many-to-one association to Report
	@OneToMany(mappedBy="manager")
	@JsonIgnore
	private List<Report> reports;

	public Appointment addAppointment(Appointment appointment) {
		getAppointments().add(appointment);
		appointment.setManager(this);

		return appointment;
	}

	public Appointment removeAppointment(Appointment appointment) {
		getAppointments().remove(appointment);
		appointment.setManager(null);

		return appointment;
	}

	public Report addReport(Report report) {
		getReports().add(report);
		report.setManager(this);

		return report;
	}

	public Report removeReport(Report report) {
		getReports().remove(report);
		report.setManager(null);

		return report;
	}

}