package com.cg.censusmanagementsystem.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detailinformation")
public class Details {

	@Id
	private int familyIdentification;
	private String nameOfMember;
	private String relation;
	private int idqr;
	private String race;
	private String gender;
	private int age;
	private int wages;
	private String profession;
	private String education;
	private Date dateOfBirth;
	private String maritalStatus;
	private int censusYear;
	
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getFamilyIdentification() {
		return familyIdentification;
	}

	public void setFamilyIdentification(int familyIdentification) {
		this.familyIdentification = familyIdentification;
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

	public int getIdqr() {
		return idqr;
	}

	public void setIdqr(int idqr) {
		this.idqr = idqr;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWages() {
		return wages;
	}

	public void setWages(int wages) {
		this.wages = wages;
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
