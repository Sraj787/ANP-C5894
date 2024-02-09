package com.SpringBoot.CategoryProduct.Repository;

import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.SpringBoot.CategoryProduct.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
