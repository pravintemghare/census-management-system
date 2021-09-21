package com.cg.censusmanagementsystem.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "enumerator")
public class Enumerator {
@NotBlank(message = "First Name is required")
	
    
	private String firstname;
	
	@NotBlank(message = "Last Name is required")
	private String lastname;
	
	@Id
	@NotBlank(message = "Username is required")
	@Email(message = "Please Enter Valid Email Address")
	private String email;
	
	@NotBlank(message = "Password is required")
	@Pattern(regexp = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$",message = "Minimum eight characters,at least one uppercase letter,one lowercase letter,one number and one special character")
	private String password;
	
	@NotBlank(message = "Confirm Password is required")
	@Pattern(regexp = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$",message = "Minimum eight characters,at least one uppercase letter,one lowercase letter,one number and one special character")
	private String cpassword;
	
	
	public String getCpassword() {
		return cpassword;
	}



	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}



	public Enumerator() {
		// TODO Auto-generated constructor stub
		
		}
	
	
	
	public String getPassword() {
		return password;
	}



    public void setPassword(String password) {
		this.password = password;
	}



    public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
}
