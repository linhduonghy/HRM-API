package com.cuder.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


/**
 * The persistent class for the contract_type database table.
 * 
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="contract_type")
public class ContractType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String contract_type_name;

	private String description;

	//bi-directional many-to-one association to Contract
	@OneToMany(mappedBy="contractType")
	@JsonIgnore
	private List<Contract> contracts;

	public Contract addContract(Contract contract) {
		getContracts().add(contract);
		contract.setContractType(this);

		return contract;
	}

	public Contract removeContract(Contract contract) {
		getContracts().remove(contract);
		contract.setContractType(null);

		return contract;
	}

}