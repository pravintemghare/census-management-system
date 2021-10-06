package com.cg.censusmanagementsystem.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "report1")
public class Report1 {

	@Id
	private int censusyear;
	private int agegroup1male;
	private int agegroup1female;
	private int agegroup2male;
	private int agegroup2female;
	
	public Report1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCensusyear() {
		return censusyear;
	}

	public void setCensusyear(int censusyear) {
		this.censusyear = censusyear;
	}

	public int getAgegroup1male() {
		return agegroup1male;
	}

	public void setAgegroup1male(int agegroup1male) {
		this.agegroup1male = agegroup1male;
	}

	public int getAgegroup1female() {
		return agegroup1female;
	}

	public void setAgegroup1female(int agegroup1female) {
		this.agegroup1female = agegroup1female;
	}

	public int getAgegroup2male() {
		return agegroup2male;
	}

	public void setAgegroup2male(int agegroup2male) {
		this.agegroup2male = agegroup2male;
	}

	public int getAgegroup2female() {
		return agegroup2female;
	}

	public void setAgegroup2female(int agegroup2female) {
		this.agegroup2female = agegroup2female;
	}

	
	
	
	
}
