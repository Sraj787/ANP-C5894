package com.SpringBoot.Curd.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBoot.Curd.Entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

	


}
