package com.cuder.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tittle database table.
 * 
 */
@Entity
public class Tittle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String description;

	private String nameTittle;

	private String note;

	//bi-directional many-to-one association to StaffTittle
	@OneToMany(mappedBy="tittle")
	private List<StaffTittle> staffTittles;

	public Tittle() {
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

	public String getNameTittle() {
		return this.nameTittle;
	}

	public void setNameTittle(String nameTittle) {
		this.nameTittle = nameTittle;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public List<StaffTittle> getStaffTittles() {
		return this.staffTittles;
	}

	public void setStaffTittles(List<StaffTittle> staffTittles) {
		this.staffTittles = staffTittles;
	}

	public StaffTittle addStaffTittle(StaffTittle staffTittle) {
		getStaffTittles().add(staffTittle);
		staffTittle.setTittle(this);

		return staffTittle;
	}

	public StaffTittle removeStaffTittle(StaffTittle staffTittle) {
		getStaffTittles().remove(staffTittle);
		staffTittle.setTittle(null);

		return staffTittle;
	}
}