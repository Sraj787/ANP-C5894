package com.SpringBoot.CategoryProduct.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	//Creating service Retrieved the all category
	public List<Category> FindAllCategory(){
		return categoryRepo.findAll();
	}
	
	//Creating the service To retrieved the category by using categoryId
	public Category FindById(int categoryId){
		return categoryRepo.findById(categoryId).orElseThrow(()->new CategoryException("Category Id Not Found"));
	}
	
	//Creating the service to update the category by using categoryId
	public Category UpdateById(int categoryId,Category category) {
		Category updateCategory=categoryRepo.findById(categoryId).orElseThrow(()->new CategoryException("Category Id Not Found"));
		updateCategory.setCategoryId(updateCategory.getCategoryId());
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
