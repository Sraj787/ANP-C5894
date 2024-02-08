package com.SpringBoot.CategoryProduct.Entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Categories")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
     private int categoryId;
     
	@Column(name = "category")
     private String category;
     
	@Column(name = "CategoryDetails")
     private String categoryDetails;
     

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}

	public String getCategoryDetails() {
		return categoryDetails;
	}

	public void setCategoryDetails(String categoryDetails) {
		this.categoryDetails = categoryDetails;
	}

	public List<Product> getProduct() {
		return product;
	}


	public void setProduct(List<Product> product) {
		this.product = product;
	}
	

	public Category(String category, String categoryDetails, List<Product> product) {
		super();
		this.category = category;
		this.categoryDetails = categoryDetails;
		this.product = product;
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}


	@OneToMany(targetEntity = Product.class,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "CategoryProduct_fk",referencedColumnName = "categoryId")
	@JsonBackReference
     private List<Product> product;

}
