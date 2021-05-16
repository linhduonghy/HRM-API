package com.cuder.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cuder.model.Appointment;
import com.cuder.service.AppointmentService;

@RestController
@CrossOrigin(value = "*")
@RequestMapping(value = "/appointment")
public class AppointmentController {

	@Autowired 
	AppointmentService appointmentService;
	
	@GetMapping
	public List<Appointment> getAppointmentList() {
		return appointmentService.getAllAppointment();
	}
	
	@GetMapping("/{id}")
	public Appointment getById(@PathVariable Integer id) {
		return appointmentService.findById(id);
	}
	
	@PostMapping
	public Appointment createAppointment(@RequestBody Appointment appointment) {
		return appointmentService.createAppointment(appointment);
	}
	
	@PutMapping("/{id}")
	public Appointment updateAppointment(@RequestBody Appointment newAppointment, @PathVariable Integer id) {
		return appointmentService.updateAppointment(newAppointment, id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteAppointment(@PathVariable Integer id) {
		appointmentService.deleteAppointment(id);
	}
}
