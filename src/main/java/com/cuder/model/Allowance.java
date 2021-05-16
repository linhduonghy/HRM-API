package com.cuder.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private float levelOfAllowance;

	private String typeAllowance;

	// bi-directional one-to-one association to Salary
	@OneToOne(mappedBy = "allowance", orphanRemoval = true)
	@JsonIgnore
	private Salary salary;

}