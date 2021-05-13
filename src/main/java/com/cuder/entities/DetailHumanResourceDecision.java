package com.cuder.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the detailhumanresourcedecision database table.
 * 
 */
@Entity
@NamedQuery(name="Detailhumanresourcedecision.findAll", query="SELECT d FROM Detailhumanresourcedecision d")
public class DetailHumanResourceDecision implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.DATE)
	private Date timeAppoint;

	@Temporal(TemporalType.DATE)
	private Date timeDismissed;

	//bi-directional many-to-one association to Humanresourcedecision
	@ManyToOne
	@JoinColumn(name="HumanResourceDecisionID")
	private HumanResourceDecision humanresourcedecision;

	//bi-directional many-to-one association to Member
	@ManyToOne
	@JoinColumn(name="MemberID")
	private Member member;

	public DetailHumanResourceDecision() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getTimeAppoint() {
		return this.timeAppoint;
	}

	public void setTimeAppoint(Date timeAppoint) {
		this.timeAppoint = timeAppoint;
	}

	public Date getTimeDismissed() {
		return this.timeDismissed;
	}

	public void setTimeDismissed(Date timeDismissed) {
		this.timeDismissed = timeDismissed;
	}

	public HumanResourceDecision getHumanresourcedecision() {
		return this.humanresourcedecision;
	}

	public void setHumanresourcedecision(HumanResourceDecision humanresourcedecision) {
		this.humanresourcedecision = humanresourcedecision;
	}

	public Member getMember() {
		return this.member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

}