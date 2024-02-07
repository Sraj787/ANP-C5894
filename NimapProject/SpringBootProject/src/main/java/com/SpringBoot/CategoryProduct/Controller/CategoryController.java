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
import com.SpringBoot.CategoryProduct.Entity.Category;
import com.SpringBoot.CategoryProduct.Service.CategoryService;
import com.SpringBoot.CategoryProduct.Service.ProductService;

@RestController
@RequestMapping("api")
public class CategoryController {
	
	@Autowired
	CategoryService cs;
	
	@Autowired
	ProductService ps; 
	
	/*Adding the Categories using PostMapping*/
	@PostMapping("/categories")
	public ResponseEntity<Category> SaveCategory(@RequestBody Category category){
		return new ResponseEntity<Category>(cs.AddCategory(category),HttpStatus.OK);
		
	}
	/*Retrieved the all categories using GetMapping annotation*/
	@GetMapping("/categories")
	public List<Category> GetAllCategory(){
		return cs.FindAllCategory();
	}
	/*updating the categories using categoryId*/
	@PutMapping("/categories/{id}")
	public ResponseEntity<Category> UpdateCategory(@PathVariable("id") int categoryId,@RequestBody Category category){
		return new ResponseEntity<Category>(cs.UpdateById(categoryId, category),HttpStatus.OK);
	}
	

	/*Retrieved the category using cateogryId*/
	@GetMapping("/categories/{id}")
	public ResponseEntity<Category> GetCategory(@PathVariable("id") int categoryId){
		return new ResponseEntity<Category>(cs.FindById(categoryId),HttpStatus.OK);
	}
	
	/*Deleting the category using cateogryId*/
	@DeleteMapping("/categories/{id}")
	public ResponseEntity<String> DeleteCategory(@PathVariable("id") int categoryId){
		cs.DeleteById(categoryId);
		return new ResponseEntity<String>("Category Successfully Delete",HttpStatus.OK);
	}
	
	

}
