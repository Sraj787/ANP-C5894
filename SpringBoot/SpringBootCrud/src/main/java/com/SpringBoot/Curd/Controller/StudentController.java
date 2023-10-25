package com.SpringBoot.Curd.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.Curd.Entity.Student;
import com.SpringBoot.Curd.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService sv;
	
	@PostMapping("/Student/addStudent")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student)
	{
		return new ResponseEntity<Student>(sv.addStudent(student),HttpStatus.OK);	
	}
	
	@GetMapping("/Student/getStudentDetails/{sid}")
	public ResponseEntity<Student> getStudentDetails(@PathVariable("sid") int sid)
	{
		return new ResponseEntity<Student>(sv.getStudentDetails(sid),HttpStatus.OK);	
	}
	
	@PutMapping("/Student/EditSudentDetails/{sid}")
	public ResponseEntity<Student> EditStudentDetails(@PathVariable("sid") int sid,@RequestBody Student student)
	{
		return new ResponseEntity<Student>(sv.editStudentDetails(student, sid),HttpStatus.OK);
		
	}
	
	@DeleteMapping("/Student/DeleteStudentDetails/{sid}")
	public ResponseEntity<String> deleteStudentDetails(@PathVariable("sid") int sid){
		sv.deleteStudentDetails(sid);
		return new ResponseEntity<String>("Deleted Sucessfully...",HttpStatus.OK);
		
	}

}
