package com.cuder.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Contract implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String description;

	private String note;
	
	private Date contract_end_date;

	private Date contract_signing_date;

	//bi-directional many-to-one association to ContractType
	@ManyToOne
	@JoinColumn(name="contract_type_id")
	private ContractType contractType;

	//bi-directional many-to-one association to Staff
	@ManyToOne
	@JoinColumn(name="staff_id")
	private Staff staff;

	//bi-directional many-to-one association to Manager
	@ManyToOne
	@JoinColumn(name="manager_id")
	private Manager manager;

}