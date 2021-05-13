package com.cuder.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the detaildegree database table.
 * 
 */
@Entity
@NamedQuery(name="Detaildegree.findAll", query="SELECT d FROM Detaildegree d")
public class DetailDegree implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private float timeTraining;

	private String trainingPlace;

	private String typeTraining;

	//bi-directional many-to-one association to Degree
	@ManyToOne
	@JoinColumn(name="DegreeID")
	private Degree degree;

	//bi-directional many-to-one association to Member
	@ManyToOne
	@JoinColumn(name="MemberID")
	private Member member;

	public DetailDegree() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getTimeTraining() {
		return this.timeTraining;
	}

	public void setTimeTraining(float timeTraining) {
		this.timeTraining = timeTraining;
	}

	public String getTrainingPlace() {
		return this.trainingPlace;
	}

	public void setTrainingPlace(String trainingPlace) {
		this.trainingPlace = trainingPlace;
	}

	public String getTypeTraining() {
		return this.typeTraining;
	}

	public void setTypeTraining(String typeTraining) {
		this.typeTraining = typeTraining;
	}

	public Degree getDegree() {
		return this.degree;
	}

	public void setDegree(Degree degree) {
		this.degree = degree;
	}

	public Member getMember() {
		return this.member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

}