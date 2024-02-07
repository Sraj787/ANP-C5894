package com.SpringBoot.CategoryProduct.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.CategoryProduct.Entity.Product;
import com.SpringBoot.CategoryProduct.Service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	ProductService productservice;
	
	/*Adding the product using postmapping*/
	@PostMapping("/products")
	public ResponseEntity<Product> SaveProduct(@RequestBody Product product){
		return new ResponseEntity<Product>(productservice.AddProduct(product),HttpStatus.OK);
		
	}
	
	/*using GetMapping annotation to retrieved the all product*/
	@GetMapping("/products")
	public List<Product> GetAllProduct(){
		return productservice.getAllProduct();
	}
	
	/*Updating the product using PutMapping annotation */
	@PutMapping("/products/{id}")
	public ResponseEntity<Product> UpdateProduct(@PathVariable("id") int productId,@RequestBody Product product){
		return new ResponseEntity<Product>(productservice.UpdateProductById(productId, product),HttpStatus.OK);
	}
	
	/*Retrieved the product using productId by using GetMapping annotation */
	@GetMapping("/products/{id}")
	public ResponseEntity<Product> GetProduct(@PathVariable("id") int ProductId){
		return new ResponseEntity<Product>(productservice.getByProductId(ProductId),HttpStatus.OK);
	}
	
	/*Deleting the product by using productId*/
	@DeleteMapping("products/{id}")
	public ResponseEntity<String> DeleteProduct(@PathVariable("id") int productId){
		productservice.ProductDeleteById(productId);;
		return new ResponseEntity<String>("product Successfully Delete",HttpStatus.OK);
	}
}
