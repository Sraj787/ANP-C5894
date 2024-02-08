package com.SpringBoot.CategoryProduct.Repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.SpringBoot.CategoryProduct.Entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

	@Query("from Category")
	public List<Category> findCategory(Pageable pageable);
	
	@Query("from Category")
	public Iterable<Category> sortCategory(Sort sort);
}
