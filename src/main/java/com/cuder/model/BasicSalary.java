package com.cuder.model;

import java.io.Serializable;
import javax.persistence.*;

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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private float basic_salary;

	//bi-directional one-to-one association to Salary
	@OneToOne(mappedBy = "basicSalary")
	private Salary salary;
}