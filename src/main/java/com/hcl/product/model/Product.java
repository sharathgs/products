package com.hcl.product.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue
	private int id;
	private String productName;
	private String productDescription;
	private String productAmount;
	private String productLikes;
	private int categoryproduct;
	
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
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getProductAmount() {
		return productAmount;
	}
	public void setProductAmount(String productAmount) {
		this.productAmount = productAmount;
	}
	public String getProductLikes() {
		return productLikes;
	}
	public void setProductLikes(String productLikes) {
		this.productLikes = productLikes;
	}
	public int getCategoryproduct() {
		return categoryproduct;
	}
	public void setCategoryproduct(int categoryproduct) {
		this.categoryproduct = categoryproduct;
	}
	
	public Product(int id, String productName, String productDescription, String productAmount, String productLikes,
			int categoryproduct) {
		super();
		this.id = id;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productAmount = productAmount;
		this.productLikes = productLikes;
		this.categoryproduct = categoryproduct;
	}
	
	public Product() {
		super();
	}
	
	
	

}
