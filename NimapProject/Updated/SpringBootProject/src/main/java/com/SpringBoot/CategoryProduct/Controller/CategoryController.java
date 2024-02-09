package com.SpringBoot.CategoryProduct.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.SpringBoot.CategoryProduct.Entity.Category;
import com.SpringBoot.CategoryProduct.Exceptions.CategoryException;
import com.SpringBoot.CategoryProduct.Exceptions.ProductExceptions;
import com.SpringBoot.CategoryProduct.Service.CategoryService;


@RestController
@RequestMapping("/api")
public class CategoryController {

	@Autowired
	CategoryService cs;

	/*
	 * Adding the Categories using PostMapping localhost:8080/api/categories
	 */
	@PostMapping("/categories")
	public ResponseEntity<Category> SaveCategory(@RequestBody Category category) {
		return new ResponseEntity<Category>(cs.AddCategory(category), HttpStatus.OK);

	}

	/*
	 * Retrieved the all categories using GetMapping annotation with the help of Pagination 
	 * localhost:8080/api/categories?page=1 get the 3 product in one page
	 */
	@GetMapping("/categories")
	public Page<Category> getCategory(@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "3") int size) {
		if (size <= 0) {
			throw new CategoryException("Category not exist");
		}
		return cs.getCategoryUsingPaging(PageRequest.of(page, size));
	}

	/*
	 * sorting implementation In Category show the product with sorted 
	 * localhost:8080/api/categories/sorting
	 */
	@GetMapping("/categories/sort")
	public Page<Category> getCategoryUsingSorting(@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "3") int size) {
		if (size <= 0) {
			throw new ProductExceptions("Category not exist");
		}
		String sortBy = "category";
		Sort sort = Sort.by(Sort.Direction.ASC, sortBy);
		Pageable pageable = PageRequest.of(page, size, sort);
		return cs.getCategoryUsingSorting(pageable);
	}
	
	/*
	 * updating the categories using categoryId
	 * localhost:8080/api/categories/{categoryId}
	 */
	@PutMapping("/categories/{id}")
	public ResponseEntity<Category> UpdateCategory(@PathVariable("id") int categoryId, @RequestBody Category category) {
		return new ResponseEntity<Category>(cs.UpdateById(categoryId, category), HttpStatus.OK);
	}

	/*
	 * Retrieved the category using cateogryId
	 * localhost:8080/api/categories/{categoryId}
	 */
	@GetMapping("/categories/{id}")
	public ResponseEntity<Category> GetCategory(@PathVariable("id") int categoryId) {
		return new ResponseEntity<Category>(cs.FindById(categoryId), HttpStatus.OK);
	}

	/*
	 * Deleting the category using cateogryId
	 * localhost:8080/api/categories/{categoryId}
	 */
	@DeleteMapping("/categories/{id}")
	public ResponseEntity<String> DeleteCategory(@PathVariable("id") int categoryId) {
		cs.DeleteById(categoryId);
		return new ResponseEntity<String>("Category Successfully Delete", HttpStatus.OK);
	}

}
