package com.cuder.model;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


/**
 * The persistent class for the contract database table.
 * 
 */
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

	//bi-directional many-to-one association to ContractType
	@ManyToOne
	@JoinColumn(name="contract_type_id")
	private ContractType contractType;

	//bi-directional one-to-one association to Staff
	@OneToOne
	@JoinColumn(name="staff_id")
	private Staff staff;

	//bi-directional one-to-many association to DetailContract
	@OneToMany(mappedBy="contract")
	private List<DetailContract> detailContracts;

	public DetailContract addDetailContract(DetailContract detailContract) {
		getDetailContracts().add(detailContract);
		detailContract.setContract(this);

		return detailContract;
	}

	public DetailContract removeDetailContract(DetailContract detailContract) {
		getDetailContracts().remove(detailContract);
		detailContract.setContract(null);

		return detailContract;
	}

}