package com.SpringBoot.CategoryProduct.DTO;

import com.SpringBoot.CategoryProduct.Entity.Category;
import com.SpringBoot.CategoryProduct.Entity.Product;

public class ProductWithCategoryDTO {
    private Product product;
    private Category category;
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public ProductWithCategoryDTO(Product product, Category category) {
		super();
		this.product = product;
		this.category = category;
	}
	public ProductWithCategoryDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
}
