package com.hcl.product.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categorycount")
public class CategoryCount {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String category;
	private int categoryCountByUserName;
	private String UserName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getCategoryCountByUserName() {
		return categoryCountByUserName;
	}
	public void setCategoryCountByUserName(int categoryCountByUserName) {
		this.categoryCountByUserName = categoryCountByUserName;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public CategoryCount(int id, String category, int categoryCountByUserName, String userName) {
		super();
		this.id = id;
		this.category = category;
		this.categoryCountByUserName = categoryCountByUserName;
		UserName = userName;
	}
	public CategoryCount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
