package com.SpringBoot.Curd.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.Curd.Entity.Department;
import com.SpringBoot.Curd.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	DepartmentService dv;
	
	@PostMapping("/Department/addDeptDetails")
	public ResponseEntity<Department> addDeptDetails(@RequestBody Department department) {
		return new ResponseEntity<Department>(dv.addDepartment(department),HttpStatus.OK);
		
	}
	
	@GetMapping("/Department/getDeptDetails/{dId}")
	public ResponseEntity<Department> getDeptDetails(@PathVariable("dId") int dId){
		return new ResponseEntity<Department>(dv.getDepartmentDetails(dId),HttpStatus.OK);
	}
	
	@PutMapping("/department/updateDept/{did}")
	public ResponseEntity<Department> updateDeptDetails(@PathVariable("dId") int dId,@RequestBody Department department){
		
		return new ResponseEntity<Department>(dv.updateDeparmentDetails(department, dId),HttpStatus.OK);
		
	}
	@GetMapping("/Department/getAllDept")
	Iterable<Department>getAllDept(){
		return dv.getAllDept();
		
	}
	
}
