package com.SpringBoot.Curd.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.Curd.Entity.Department;
import com.SpringBoot.Curd.service.DepartmentService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class DepartmentController {

	@Autowired
	DepartmentService ds;
	
	@PostMapping("/department/addDepartment")
	public ResponseEntity<Department> addDeptDetails(@RequestBody Department department) {
		return new ResponseEntity<Department>(ds.addDepartment(department),HttpStatus.OK);
		
	}
	@GetMapping("/department/departments")
	public List<Department> getAllDepartment()
	{
		return ds.getAllDept();
	}
	
	@GetMapping("/department/{dId}")
	public ResponseEntity<Department> getDeptDetails(@PathVariable("dId") int dId){
		return new ResponseEntity<Department>(ds.getDepartmentDetails(dId),HttpStatus.OK);
	}
	
	@PutMapping("/department/{dId}")
	public ResponseEntity<Department> updateDeptDetails(@PathVariable("dId") int dId,@RequestBody Department department){
		
		return new ResponseEntity<Department>(ds.updateDeparmentDetails(department, dId),HttpStatus.OK);
		
	}
	
	
}
