package com.cuder.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the staff_tittle database table.
 * 
 */
@Entity
@Table(name="staff_tittle")
public class StaffTittle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String approver;

	@Temporal(TemporalType.DATE)
	private Date timeAppoint;

	//bi-directional many-to-one association to Member
	@ManyToOne
	@JoinColumn(name="MemberID")
	private Member member;

	//bi-directional many-to-one association to Tittle
	@ManyToOne
	@JoinColumn(name="TittleID")
	private Tittle tittle;

	public StaffTittle() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApprover() {
		return this.approver;
	}

	public void setApprover(String approver) {
		this.approver = approver;
	}

	public Date getTimeAppoint() {
		return this.timeAppoint;
	}

	public void setTimeAppoint(Date timeAppoint) {
		this.timeAppoint = timeAppoint;
	}

	public Member getMember() {
		return this.member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Tittle getTittle() {
		return this.tittle;
	}

	public void setTittle(Tittle tittle) {
		this.tittle = tittle;
	}

}