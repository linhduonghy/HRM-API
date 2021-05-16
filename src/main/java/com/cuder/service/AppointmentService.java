package com.cuder.service;

import java.util.List;

import com.cuder.model.Appointment;

public interface AppointmentService {
	List<Appointment> getAllAppointment();

	Appointment createAppointment(Appointment appointment);

	Appointment findById(Integer a_id);

	Appointment updateAppointment(Appointment newAppointment, Integer a_id);

	void deleteAppointment(Integer a_id);
}
