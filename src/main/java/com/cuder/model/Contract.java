package com.cuder.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the contract database table.
 * 
 */
@Entity
public class Contract implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String description;

	private String note;

	//bi-directional many-to-one association to Detailcontract
	@OneToMany(mappedBy="contract")
	private List<DetailContract> detailcontracts;

	//bi-directional many-to-one association to Typecontract
	@OneToMany(mappedBy="contract")
	private List<TypeContract> typecontracts;

	public Contract() {
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

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public List<DetailContract> getDetailcontracts() {
		return this.detailcontracts;
	}

	public void setDetailcontracts(List<DetailContract> detailcontracts) {
		this.detailcontracts = detailcontracts;
	}

	public DetailContract addDetailcontract(DetailContract detailcontract) {
		getDetailcontracts().add(detailcontract);
		detailcontract.setContract(this);

		return detailcontract;
	}

	public DetailContract removeDetailcontract(DetailContract detailcontract) {
		getDetailcontracts().remove(detailcontract);
		detailcontract.setContract(null);

		return detailcontract;
	}

	public List<TypeContract> getTypecontracts() {
		return this.typecontracts;
	}

	public void setTypecontracts(List<TypeContract> typecontracts) {
		this.typecontracts = typecontracts;
	}

	public TypeContract addTypecontract(TypeContract typecontract) {
		getTypecontracts().add(typecontract);
		typecontract.setContract(this);

		return typecontract;
	}

	public TypeContract removeTypecontract(TypeContract typecontract) {
		getTypecontracts().remove(typecontract);
		typecontract.setContract(null);

		return typecontract;
	}

}