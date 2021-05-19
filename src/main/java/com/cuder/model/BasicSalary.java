package com.cuder.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



/**
 * The persistent class for the basic_salary database table.
 * 
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="basic_salary")
public class BasicSalary implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String basic_salary_name;
	private float basic_salary_value;
	private Date createdDate;

	//bi-directional one-to-many association to Salary
	@OneToMany(mappedBy = "basicSalary", orphanRemoval = true)
	@JsonIgnoreProperties({"member", "basicSalary","allowance"})
	private List<Salary> salaries;
}