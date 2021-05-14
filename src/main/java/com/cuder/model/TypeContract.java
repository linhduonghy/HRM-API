package com.cuder.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the typecontract database table.
 * 
 */
@Entity
public class TypeContract implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String description;

	private String nameContract;

	private String note;

	//bi-directional many-to-one association to Contract
	@ManyToOne
	@JoinColumn(name="ContractID")
	private Contract contract;

	public TypeContract() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNameContract() {
		return this.nameContract;
	}

	public void setNameContract(String nameContract) {
		this.nameContract = nameContract;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Contract getContract() {
		return this.contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

}