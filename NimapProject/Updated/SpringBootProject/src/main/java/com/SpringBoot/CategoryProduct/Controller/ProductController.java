package com.SpringBoot.CategoryProduct.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.SpringBoot.CategoryProduct.Entity.Product;
import com.SpringBoot.CategoryProduct.Exceptions.ProductExceptions;
import com.SpringBoot.CategoryProduct.Service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	ProductService productservice;

	/*
	 * Adding the product using post mapping localhost:8080/api/products
	 */
	@PostMapping("/products")
	public ResponseEntity<Product> SaveProduct(@RequestBody Product product) {
		return new ResponseEntity<Product>(productservice.AddProduct(product), HttpStatus.OK);

	}

	/*
	 * Retrieved the all products using GetMapping annotation with the help of Pagination 
	 * localhost:8080/api/products?page=1 get the 3 product in one page
	 */
        @GetMapping("/products")
	public Page<Product> getProduct(@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "3") int size) {
		if (size <= 0) {
			throw new ProductExceptions("Category not exist");
		}

		return productservice.getProductUsingPaging(PageRequest.of(page, size));
	}

	/*
	 * sorting implementation In product or show the product with sorted productName
	 * localhost:8080/api/products/sorting
	 */
	@GetMapping("/products/sort")
	public Page<Product> getProductUsingSorting(@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "3") int size) {
		if (size <= 0) {
			throw new ProductExceptions("Product not exist");
		}
		String sortBy = "productName";
		
		Sort sort = Sort.by(Sort.Direction.ASC, sortBy);
		
		Pageable pageable = PageRequest.of(page, size, sort);
		
		return productservice.getProductUsingSorting(pageable);
	}

	/*
	 * Updating the product using PutMapping annotation
	 * localhost:8080/api/products/{productID}
	 */
	@PutMapping("/products/{id}")
	public ResponseEntity<Product> UpdateProduct(@PathVariable("id") int productId, @RequestBody Product product) {
		return new ResponseEntity<Product>(productservice.UpdateProductById(productId, product), HttpStatus.OK);
	}

	/*
	 * Retrieved the product using productId by using GetMapping annotation
	 * localhost:8080/api/products/{productID}
	 */
	@GetMapping("/products/{id}")
	public ResponseEntity<?> GetProduct(@PathVariable("id") int ProductId) {
		Product product = productservice.getByProductId(ProductId);
		return ResponseEntity.ok(product);
	}

	/*
	 * Deleting the product by using productId
	 * localhost:8080/api/products/{productID}
	 */
	@DeleteMapping("products/{id}")
	public ResponseEntity<String> DeleteProduct(@PathVariable("id") int productId) {
		productservice.ProductDeleteById(productId);
		;
		return new ResponseEntity<String>("product Successfully Delete", HttpStatus.OK);
	}
}
