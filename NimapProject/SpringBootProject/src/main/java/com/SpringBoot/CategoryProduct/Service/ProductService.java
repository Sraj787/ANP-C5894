package com.SpringBoot.CategoryProduct.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
	
	//Creating the service To retrieved the all product details
	public List<Product> getAllProduct(){
		return productrepo.findAll();
	}
	
	//Creating the service to retrieved the product by using productId
	public Product getByProductId(int productId) {
		return productrepo.findById(productId).orElseThrow(()->new ProductExceptions("Product Id Not Found"));
	}

	//Creating the service to updated the product details by using productId
	public Product UpdateProductById(int productId,Product product) {
		Product  updateproduct = productrepo.findById(productId).orElseThrow(()->new ProductExceptions("Product Id Not Found"));
		updateproduct.setProductID(updateproduct.getProductID());
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
