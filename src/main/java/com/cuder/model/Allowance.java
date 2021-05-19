package com.cuder.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * The persistent class for the allowance database table.
 * 
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Allowance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String allowance_code;

	private String allowance_name;
	
	private float allowance_value;

	// bi-directional one-to-many association to Salary
	@OneToMany(mappedBy = "allowance", orphanRemoval = true)
	@JsonIgnoreProperties({"member", "basicSalary","allowance"})
	private List<Salary> salaries;

}