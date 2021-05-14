package com.cuder.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the detailreport database table.
 * 
 */
@Entity
public class DetailReport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String performingPerson;

	@Temporal(TemporalType.DATE)
	private Date timeReport;

	//bi-directional many-to-one association to Member
	@ManyToOne
	@JoinColumn(name="MemberID")
	private Member member;

	//bi-directional many-to-one association to Report
	@ManyToOne
	@JoinColumn(name="ReportID")
	private Report report;

	public DetailReport() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPerformingPerson() {
		return this.performingPerson;
	}

	public void setPerformingPerson(String performingPerson) {
		this.performingPerson = performingPerson;
	}

	public Date getTimeReport() {
		return this.timeReport;
	}

	public void setTimeReport(Date timeReport) {
		this.timeReport = timeReport;
	}

	public Member getMember() {
		return this.member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Report getReport() {
		return this.report;
	}

	public void setReport(Report report) {
		this.report = report;
	}

}