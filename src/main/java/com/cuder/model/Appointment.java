package com.cuder.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Date;


/**
 * The persistent class for the appointment database table.
 * 
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Appointment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private Date appointed_date;

	private String decription;

	//bi-directional many-to-one association to Manager
	@ManyToOne
	@JoinColumn(name = "manager_id")
	private Manager manager;

	//bi-directional many-to-one association to Staff
	@ManyToOne
	@JoinColumn(name = "staff_id")
	@JsonIgnoreProperties("appointments")
	private Staff staff;

	//bi-directional many-to-one association to Title
	@ManyToOne
	@JoinColumn(name="title_id")
	private Title title;
}