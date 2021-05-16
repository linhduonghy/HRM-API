package com.cuder.model;

import java.io.Serializable;
import javax.persistence.*;

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
	private List<Appointment> appointments;

	//bi-directional one-to-many association to DetailContract
	@OneToMany(mappedBy="manager")
	private List<DetailContract> detailContracts;

	//bi-directional many-to-one association to Member
	@OneToOne
	@JoinColumn(name="member_id")
	private Member member;

	//bi-directional many-to-one association to Report
	@OneToMany(mappedBy="manager")
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

	public DetailContract addDetailContract(DetailContract detailContract) {
		getDetailContracts().add(detailContract);
		detailContract.setManager(this);

		return detailContract;
	}

	public DetailContract removeDetailContract(DetailContract detailContract) {
		getDetailContracts().remove(detailContract);
		detailContract.setManager(null);

		return detailContract;
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