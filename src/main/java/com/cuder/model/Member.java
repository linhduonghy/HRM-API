package com.cuder.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the member database table.
 * 
 */
@Entity
public class Member implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String address;


	@Column(name="card_number")
	private String cardNumber;

	private String discriminator;

	@Temporal(TemporalType.DATE)
	private Date dob;

	private String email;

	private float experienceYear;

	private String idcard;

	private String name;

	private String password;

	private String phone;

	private String sex;

	private String username;

	//bi-directional many-to-one association to Detailcontract
	@OneToMany(mappedBy="member")
	private List<DetailContract> detailcontracts;

	//bi-directional many-to-one association to Detaildegree
	@OneToMany(mappedBy="member")
	private List<DetailDegree> detaildegrees;

	//bi-directional many-to-one association to Detailhumanresourcedecision
	@OneToMany(mappedBy="member")
	private List<DetailHumanResourceDecision> detailhumanresourcedecisions;

	//bi-directional many-to-one association to Detailreport
	@OneToMany(mappedBy="member")
	private List<DetailReport> detailreports;

	//bi-directional many-to-one association to Company
	@ManyToOne
	@JoinColumn(name="CompanyID")
	private Company company;

	//bi-directional many-to-one association to Departmant
	@ManyToOne
	@JoinColumn(name="DepartmantID")
	private Departmant departmant;

	//bi-directional many-to-one association to Salary
	@ManyToOne
	@JoinColumn(name="SalaryID")
	private Salary salary;

	//bi-directional many-to-one association to StaffTittle
	@OneToMany(mappedBy="member")
	private List<StaffTittle> staffTittles;

	public Member() {
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCardNumber() {
		return this.cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getDiscriminator() {
		return this.discriminator;
	}

	public void setDiscriminator(String discriminator) {
		this.discriminator = discriminator;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getExperienceYear() {
		return this.experienceYear;
	}

	public void setExperienceYear(float experienceYear) {
		this.experienceYear = experienceYear;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdcard() {
		return this.idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<DetailContract> getDetailcontracts() {
		return this.detailcontracts;
	}

	public void setDetailcontracts(List<DetailContract> detailcontracts) {
		this.detailcontracts = detailcontracts;
	}

	public DetailContract addDetailcontract(DetailContract detailcontract) {
		getDetailcontracts().add(detailcontract);
		detailcontract.setMember(this);

		return detailcontract;
	}

	public DetailContract removeDetailcontract(DetailContract detailcontract) {
		getDetailcontracts().remove(detailcontract);
		detailcontract.setMember(null);

		return detailcontract;
	}

	public List<DetailDegree> getDetaildegrees() {
		return this.detaildegrees;
	}

	public void setDetaildegrees(List<DetailDegree> detaildegrees) {
		this.detaildegrees = detaildegrees;
	}

	public DetailDegree addDetaildegree(DetailDegree detaildegree) {
		getDetaildegrees().add(detaildegree);
		detaildegree.setMember(this);

		return detaildegree;
	}

	public DetailDegree removeDetaildegree(DetailDegree detaildegree) {
		getDetaildegrees().remove(detaildegree);
		detaildegree.setMember(null);

		return detaildegree;
	}

	public List<DetailHumanResourceDecision> getDetailhumanresourcedecisions() {
		return this.detailhumanresourcedecisions;
	}

	public void setDetailhumanresourcedecisions(List<DetailHumanResourceDecision> detailhumanresourcedecisions) {
		this.detailhumanresourcedecisions = detailhumanresourcedecisions;
	}

	public DetailHumanResourceDecision addDetailhumanresourcedecision(DetailHumanResourceDecision detailhumanresourcedecision) {
		getDetailhumanresourcedecisions().add(detailhumanresourcedecision);
		detailhumanresourcedecision.setMember(this);

		return detailhumanresourcedecision;
	}

	public DetailHumanResourceDecision removeDetailhumanresourcedecision(DetailHumanResourceDecision detailhumanresourcedecision) {
		getDetailhumanresourcedecisions().remove(detailhumanresourcedecision);
		detailhumanresourcedecision.setMember(null);

		return detailhumanresourcedecision;
	}

	public List<DetailReport> getDetailreports() {
		return this.detailreports;
	}

	public void setDetailreports(List<DetailReport> detailreports) {
		this.detailreports = detailreports;
	}

	public DetailReport addDetailreport(DetailReport detailreport) {
		getDetailreports().add(detailreport);
		detailreport.setMember(this);

		return detailreport;
	}

	public DetailReport removeDetailreport(DetailReport detailreport) {
		getDetailreports().remove(detailreport);
		detailreport.setMember(null);

		return detailreport;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Departmant getDepartmant() {
		return this.departmant;
	}

	public void setDepartmant(Departmant departmant) {
		this.departmant = departmant;
	}

	public Salary getSalary() {
		return this.salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	public List<StaffTittle> getStaffTittles() {
		return this.staffTittles;
	}

	public void setStaffTittles(List<StaffTittle> staffTittles) {
		this.staffTittles = staffTittles;
	}

	public StaffTittle addStaffTittle(StaffTittle staffTittle) {
		getStaffTittles().add(staffTittle);
		staffTittle.setMember(this);

		return staffTittle;
	}

	public StaffTittle removeStaffTittle(StaffTittle staffTittle) {
		getStaffTittles().remove(staffTittle);
		staffTittle.setMember(null);

		return staffTittle;
	}

}