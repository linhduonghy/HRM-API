package com.cuder.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


/**
 * The persistent class for the company database table.
 * 
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String company_address;

	private String company_name;

	private String company_phone;

	private String description;

	//bi-directional many-to-one association to Departmant
	@OneToMany(mappedBy="company", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnore
	private List<Department> departmants;

	public Department addDepartmant(Department departmant) {
		getDepartmants().add(departmant);
		departmant.setCompany(this);

		return departmant;
	}

	public Department removeDepartmant(Department departmant) {
		getDepartmants().remove(departmant);
		departmant.setCompany(null);

		return departmant;
	}
}