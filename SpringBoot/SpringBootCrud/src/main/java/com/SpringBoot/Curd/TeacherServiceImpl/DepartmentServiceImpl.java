package com.SpringBoot.Curd.TeacherServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.SpringBoot.Curd.Entity.Department;
import com.SpringBoot.Curd.Exception.DepartmentIdNotFoundException;
import com.SpringBoot.Curd.repository.DepartmentRepository;
import com.SpringBoot.Curd.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	DepartmentRepository drepo;
	
	@Override
	public Department addDepartment(Department department) {
		// TODO Auto-generated method stub
		return drepo.save(department);
	}
	
	@Override
	public Department getDepartmentDetails(int dId) {
		
		return drepo.findById(dId).orElseThrow(()->new DepartmentIdNotFoundException("Department id is incorrect"));

	}

	@Override
	public Department updateDeparmentDetails(Department department, int dId) {
		Department updateDepartment = drepo.findById(dId).orElseThrow(()->new DepartmentIdNotFoundException("Departemnt id is incorrect"));
		
		updateDepartment.setNoOfEmployee(updateDepartment.getNoOfEmployee());
		updateDepartment.setDhod(updateDepartment.getDhod());
		
		drepo.save(updateDepartment);
		return updateDepartment;
	}
	

	@Override
	public List<Department> getAllDept() {
		// TODO Auto-generated method stub
		return drepo.findAll();
	}

	

}
