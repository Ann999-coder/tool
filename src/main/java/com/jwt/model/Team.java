package com.jwt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="TBL_TEAM")

public class Team {

	@Id
    @GeneratedValue
    private Long id;
     
    @Column(name="first_name")
    @NotBlank(message = "fName is mandatory")
    private String firstName;
     
    @Column(name="last_name")
    @NotBlank(message = "lName is mandatory")
    private String lastName;
     
    @Column(name="email", nullable=false, length=200)
    @NotBlank(message = "email is mandatory")
    private String email;
    
    @Column(name="Contact")
    @NotBlank(message = "contact is mandatory")
    private String contact;
    
    
    @Column(name="Password")
    @NotBlank(message = "password is mandatory")
    private String password;
    
    @Column(name="Status")
    @NotBlank(message = "status is mandatory")
    private String status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Team(Long id, String firstName, String lastName, String email, String contact, String password,
			String status) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contact = contact;
		this.password = password;
		this.status = status;
	}

	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	    

}
