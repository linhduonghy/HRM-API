package com.cuder.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the report database table.
 * 
 */
@Entity
public class Report implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String description;

	@Column(name="`NameReport::String`")
	private int nameReport__String;

	//bi-directional many-to-one association to Detailreport
	@OneToMany(mappedBy="report")
	private List<DetailReport> detailreports;

	public Report() {
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

	public int getNameReport__String() {
		return this.nameReport__String;
	}

	public void setNameReport__String(int nameReport__String) {
		this.nameReport__String = nameReport__String;
	}

	public List<DetailReport> getDetailreports() {
		return this.detailreports;
	}

	public void setDetailreports(List<DetailReport> detailreports) {
		this.detailreports = detailreports;
	}

	public DetailReport addDetailreport(DetailReport detailreport) {
		getDetailreports().add(detailreport);
		detailreport.setReport(this);

		return detailreport;
	}

	public DetailReport removeDetailreport(DetailReport detailreport) {
		getDetailreports().remove(detailreport);
		detailreport.setReport(null);

		return detailreport;
	}

}