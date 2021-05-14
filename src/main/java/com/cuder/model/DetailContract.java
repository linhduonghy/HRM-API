package com.cuder.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the detailcontract database table.
 * 
 */
@Entity
public class DetailContract implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.DATE)
	private Date endDate;

	@Temporal(TemporalType.DATE)
	private Date signDate;

	//bi-directional many-to-one association to Contract
	@ManyToOne
	@JoinColumn(name="ContractID")
	private Contract contract;

	//bi-directional many-to-one association to Member
	@ManyToOne
	@JoinColumn(name="MemberID")
	private Member member;

	public DetailContract() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getSignDate() {
		return this.signDate;
	}

	public void setSignDate(Date signDate) {
		this.signDate = signDate;
	}

	public Contract getContract() {
		return this.contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

	public Member getMember() {
		return this.member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

}