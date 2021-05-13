package com.cuder.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the degree database table.
 * 
 */
@Entity
@NamedQuery(name="Degree.findAll", query="SELECT d FROM Degree d")
public class Degree implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String description;

	private float effectiveTime;

	private String nameDegree;

	//bi-directional many-to-one association to Detaildegree
	@OneToMany(mappedBy="degree")
	private List<DetailDegree> detaildegrees;

	public Degree() {
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

	public float getEffectiveTime() {
		return this.effectiveTime;
	}

	public void setEffectiveTime(float effectiveTime) {
		this.effectiveTime = effectiveTime;
	}

	public String getNameDegree() {
		return this.nameDegree;
	}

	public void setNameDegree(String nameDegree) {
		this.nameDegree = nameDegree;
	}

	public List<DetailDegree> getDetaildegrees() {
		return this.detaildegrees;
	}

	public void setDetaildegrees(List<DetailDegree> detaildegrees) {
		this.detaildegrees = detaildegrees;
	}

	public DetailDegree addDetaildegree(DetailDegree detaildegree) {
		getDetaildegrees().add(detaildegree);
		detaildegree.setDegree(this);

		return detaildegree;
	}

	public DetailDegree removeDetaildegree(DetailDegree detaildegree) {
		getDetaildegrees().remove(detaildegree);
		detaildegree.setDegree(null);

		return detaildegree;
	}

}