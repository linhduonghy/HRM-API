package com.cuder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuder.model.Appointment;
import com.cuder.repository.AppointmentRepository;
import com.cuder.service.AppointmentService;

@Service
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	private AppointmentRepository appointmentRepo;

	@Override
	public List<Appointment> getAllAppointment() {
		return appointmentRepo.findAll();
	}

	@Override
	public Appointment createAppointment(Appointment appointment) {
		return appointmentRepo.save(appointment);
	}

	@Override
	public Appointment findById(Integer a_id) {
		return appointmentRepo.findById(a_id).map(a -> {
			return a;
		}).orElseGet(() -> {
			return null;
		});
	}

	@Override
	public Appointment updateAppointment(Appointment newAppointment, Integer a_id) {
		Appointment appointment = findById(a_id);
		if (appointment == null) {
			return null;
		}
		appointment.setAppointed_date(newAppointment.getAppointed_date());
		appointment.setDecription(newAppointment.getDecription());
		appointment.setManager(newAppointment.getManager());
		appointment.setStaff(newAppointment.getStaff());
		appointment.setTitle(newAppointment.getTitle());
		
		return appointmentRepo.save(appointment);
	}

	@Override
	public void deleteAppointment(Integer a_id) {
		
		appointmentRepo.deleteById(a_id);
	}

}
