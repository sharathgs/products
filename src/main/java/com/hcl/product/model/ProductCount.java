package com.hcl.product.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productcount")
public class ProductCount {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String productName;
	private int productCountByUser;
	private String userName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductCountByUser() {
		return productCountByUser;
	}
	public void setProductCountByUser(int productCountByUser) {
		this.productCountByUser = productCountByUser;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public ProductCount(int id, String productName, int productCountByUser, String userName) {
		super();
		this.id = id;
		this.productName = productName;
		this.productCountByUser = productCountByUser;
		this.userName = userName;
	}
	public ProductCount() {
		super();
		// TODO Auto-generated constructor stub
	}

}
