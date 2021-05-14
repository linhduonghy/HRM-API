package com.cuder.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the humanresourcedecision database table.
 * 
 */
@Entity
public class HumanResourceDecision implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String decription;

	private String nameDecision;

	//bi-directional many-to-one association to Detailhumanresourcedecision
	@OneToMany(mappedBy="humanresourcedecision")
	private List<DetailHumanResourceDecision> detailhumanresourcedecisions;

	public HumanResourceDecision() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDecription() {
		return this.decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}

	public String getNameDecision() {
		return this.nameDecision;
	}

	public void setNameDecision(String nameDecision) {
		this.nameDecision = nameDecision;
	}

	public List<DetailHumanResourceDecision> getDetailhumanresourcedecisions() {
		return this.detailhumanresourcedecisions;
	}

	public void setDetailhumanresourcedecisions(List<DetailHumanResourceDecision> detailhumanresourcedecisions) {
		this.detailhumanresourcedecisions = detailhumanresourcedecisions;
	}

	public DetailHumanResourceDecision addDetailhumanresourcedecision(DetailHumanResourceDecision detailhumanresourcedecision) {
		getDetailhumanresourcedecisions().add(detailhumanresourcedecision);
		detailhumanresourcedecision.setHumanresourcedecision(this);

		return detailhumanresourcedecision;
	}

	public DetailHumanResourceDecision removeDetailhumanresourcedecision(DetailHumanResourceDecision detailhumanresourcedecision) {
		getDetailhumanresourcedecisions().remove(detailhumanresourcedecision);
		detailhumanresourcedecision.setHumanresourcedecision(null);

		return detailhumanresourcedecision;
	}

}