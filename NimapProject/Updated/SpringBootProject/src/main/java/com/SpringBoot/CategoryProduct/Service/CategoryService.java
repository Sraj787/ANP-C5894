package com.SpringBoot.CategoryProduct.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.SpringBoot.CategoryProduct.Entity.Category;
import com.SpringBoot.CategoryProduct.Exceptions.CategoryException;
import com.SpringBoot.CategoryProduct.Repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepo;
	
	//Creating the service To Add the category
	public Category AddCategory(Category category) {
		return categoryRepo.save(category);
	}
	
	//Retrieved the Category using the Pagination
	public List<Category> getCategoryUsingPaging(int page,int size){
		Pageable pageable = PageRequest.of(page, size);
		List<Category> categorylist = categoryRepo.findCategory(pageable);
		return categorylist;
	}
	
	//Retrieved the Category Using the sorting
	public Iterable<Category> getSortCategoryUsingSorting(){
		String sortBy = "categoryName";
		List<Category> categorylist = (List<Category>) categoryRepo.sortCategory(Sort.by(Sort.Direction.DESC,sortBy));
		return categorylist;
	}
	
	//Creating the service To retrieved the category by using categoryId
	public Category FindById(int categoryId){
		return categoryRepo.findById(categoryId).orElseThrow(()->new CategoryException("Category Id Not Found"));
	}
	
	//Creating the service to update the category by using categoryId
	public Category UpdateById(int categoryId,Category category) {
		Category updateCategory=categoryRepo.findById(categoryId).orElseThrow(()->new CategoryException("Category Id Not Found"));
		updateCategory.setCategory(updateCategory.getCategory());
		updateCategory.setCategoryDetails(updateCategory.getCategoryDetails());
		categoryRepo.save(updateCategory);
		return updateCategory;
	}
	
	//Creating the service to delete the category by using categoryId
	public void DeleteById(int categoryId) {
		categoryRepo.findById(categoryId).orElseThrow(()->new CategoryException("Category Id Not Found"));
		categoryRepo.deleteById(categoryId);
	}
}
