package com.SpringBoot.CategoryProduct.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.SpringBoot.CategoryProduct.Entity.Product;
import com.SpringBoot.CategoryProduct.Exceptions.ProductExceptions;
import com.SpringBoot.CategoryProduct.Repository.ProductRepository;

@Service
public class ProductService{
	
	@Autowired
	private ProductRepository productrepo;
	
	//Creating the service to add the product details
	public Product AddProduct(Product product) {
		return productrepo.save(product);
	}
	
	public Page<Product> getProductUsingPaging(Pageable pageable){
		return productrepo.findAll(pageable);
		
	}
	
	public Page<Product> getProductUsingSorting(Pageable pageable){
		return productrepo.findAll(pageable);
	}
	
	
	//Creating the service to retrieved the product by using productId
	public Product getByProductId(int productId) {
		return productrepo.findById(productId).orElseThrow(()->new ProductExceptions("Product Id Not Found"));
	}

	//Creating the service to updated the product details by using productId
	public Product UpdateProductById(int productId,Product product) {
		Product  updateproduct = productrepo.findById(productId).orElseThrow(()->new ProductExceptions("Product Id Not Found"));
		updateproduct.setProductName(updateproduct.getProductName());
		updateproduct.setProductDetails(updateproduct.getProductDetails());
		productrepo.save(updateproduct);
		return updateproduct;
	}
	
	//Creating the service to delete the product by using productId
	public void ProductDeleteById(int productId) {
		productrepo.findById(productId).orElseThrow(()->new ProductExceptions("Product Id Not Found"));
		productrepo.deleteById(productId);
	}
	
}
