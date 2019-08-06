package com.hcl.product.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "registration")
public class Registration {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String username;
	private String userpassword;
	private String address;
	private String country;
	private Long phoneno;
	private String emailid;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(Long phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	
	public Registration(int id, String username, String userpassword, String address, String country, Long phoneno,
			String emailid) {
		super();
		this.id = id;
		this.username = username;
		this.userpassword = userpassword;
		this.address = address;
		this.country = country;
		this.phoneno = phoneno;
		this.emailid = emailid;
	}
	
	
	public Registration() {
		super();
	}
}
