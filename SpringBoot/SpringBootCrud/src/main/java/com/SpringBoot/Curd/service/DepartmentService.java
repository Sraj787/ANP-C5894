package com.SpringBoot.Curd.service;

import java.util.List;

import com.SpringBoot.Curd.Entity.Department;

public interface DepartmentService {
	
	Department addDepartment(Department department);
	
	Department getDepartmentDetails(int dId);
	
	Department updateDeparmentDetails(Department department,int dId);

	List<Department> getAllDept();
}
