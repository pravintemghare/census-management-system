package com.cg.censusmanagementsystem.entities;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "census.headerinformation")
public class Header {

	//Header
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int familyIdentification;
	private String headOfFamily;
	private int idqr;
	private String gender;
	private String address;
	private String city;
	private String state;
	private String race;
	private int age;
	private String wages;
	private String profession;
	private String education;
	private Date dateOfBirth;
	private String maritalStatus;
	private int censusYear;
	
	//Details
	private String nameOfMember;
	private String relation;
	private int didqr;
	private String drace;
	private String dgender;
	private int dage;
	private String dwages;
	private String dprofession;
	private String deducation;
	private Date ddateOfBirth;
	private String dmaritalStatus;
	
	
	
	public Header() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getFamilyIdentification() {
		return familyIdentification;
	}


	public void setFamilyIdentification(int familyIdentification) {
		this.familyIdentification = familyIdentification;
	}


	public String getHeadOfFamily() {
		return headOfFamily;
	}


	public void setHeadOfFamily(String headOfFamily) {
		this.headOfFamily = headOfFamily;
	}


	public int getIdqr() {
		return idqr;
	}


	public void setIdqr(int idqr) {
		this.idqr = idqr;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getRace() {
		return race;
	}


	public void setRace(String race) {
		this.race = race;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	


	public String getWages() {
		return wages;
	}


	public void setWages(String wages) {
		this.wages = wages;
	}


	public String getDwages() {
		return dwages;
	}


	public void setDwages(String dwages) {
		this.dwages = dwages;
	}


	public String getProfession() {
		return profession;
	}


	public void setProfession(String profession) {
		this.profession = profession;
	}


	public String getEducation() {
		return education;
	}


	public void setEducation(String education) {
		this.education = education;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getMaritalStatus() {
		return maritalStatus;
	}


	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}


	public int getCensusYear() {
		return censusYear;
	}


	public void setCensusYear(int censusYear) {
		this.censusYear = censusYear;
	}


	public String getNameOfMember() {
		return nameOfMember;
	}


	public void setNameOfMember(String nameOfMember) {
		this.nameOfMember = nameOfMember;
	}


	public String getRelation() {
		return relation;
	}


	public void setRelation(String relation) {
		this.relation = relation;
	}


	public int getDidqr() {
		return didqr;
	}


	public void setDidqr(int didqr) {
		this.didqr = didqr;
	}


	public String getDrace() {
		return drace;
	}


	public void setDrace(String drace) {
		this.drace = drace;
	}


	public String getDgender() {
		return dgender;
	}


	public void setDgender(String dgender) {
		this.dgender = dgender;
	}


	public int getDage() {
		return dage;
	}


	public void setDage(int dage) {
		this.dage = dage;
	}


	

	public String getDprofession() {
		return dprofession;
	}


	public void setDprofession(String dprofession) {
		this.dprofession = dprofession;
	}


	public String getDeducation() {
		return deducation;
	}


	public void setDeducation(String deducation) {
		this.deducation = deducation;
	}


	public Date getDdateOfBirth() {
		return ddateOfBirth;
	}


	public void setDdateOfBirth(Date ddateOfBirth) {
		this.ddateOfBirth = ddateOfBirth;
	}


	public String getDmaritalStatus() {
		return dmaritalStatus;
	}


	public void setDmaritalStatus(String dmaritalStatus) {
		this.dmaritalStatus = dmaritalStatus;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
