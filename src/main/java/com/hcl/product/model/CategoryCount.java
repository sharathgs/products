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
	private String username;
	
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public CategoryCount(int id, String category, int categoryCountByUserName, String username) {
		super();
		this.id = id;
		this.category = category;
		this.categoryCountByUserName = categoryCountByUserName;
		this.username = username;
	}
	public CategoryCount() {
		super();
		// TODO Auto-generated constructor stub
	}

}
