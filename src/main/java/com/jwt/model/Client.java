package com.jwt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name="TBL_CLIENT")

public class Client {
	
	@Id
    @GeneratedValue
    private Long id;
     
    @Column(name="Company")
    @NotBlank(message = "company is mandatory")
    private String company;
     
    @Column(name="Website")
    @NotBlank(message = "website is mandatory")
    private String website;
    
    @Column(name="Contact")
    @NotBlank(message = "contact is mandatory")
    private String contact;
    
    @Column(name="email", nullable=false, length=200)
    @NotBlank(message = "message is mandatory")
    private String email;
    
    @Column(name="UserName")
    @NotBlank(message = "userName is mandatory")
    private String userName;
    
    @Column(name="Password")
    @NotBlank(message = "password is mandatory")
    private String password;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Client(Long id, String company, String website, String contact, String email, String userName,
			String password) {
		super();
		this.id = id;
		this.company = company;
		this.website = website;
		this.contact = contact;
		this.email = email;
		this.userName = userName;
		this.password = password;
	}

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

     
    
}
