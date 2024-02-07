package com.SpringBoot.CategoryProduct.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBoot.CategoryProduct.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
