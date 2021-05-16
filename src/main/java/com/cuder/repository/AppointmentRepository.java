package com.cuder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cuder.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer>{

}
