package com.cg.censusmanagementsystem.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "census.headerinformation")
public class Header {

	@Id
	private int familyIdentification;
	private String headOfFamily;
	private int familyCount;
	private int idqr;
	private String gender;
	private String address;
	private String city;
	private String state;
	private String race;
	private int age;
	private int wages;
	private String profession;
	private String education;
	private Date dateOfBirth;
	private String maritalStatus;
	private int censusYear;
	
	
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


	public int getFamilyCount() {
		return familyCount;
	}


	public void setFamilyCount(int familyCount) {
		this.familyCount = familyCount;
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
