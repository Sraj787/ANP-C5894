package com.SpringBoot.Curd.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.Curd.Entity.Student;
import com.SpringBoot.Curd.service.StudentService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	StudentService sv;
	
	@PostMapping("/Student/AddStudent")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student)
	{
		return new ResponseEntity<Student>(sv.addStudent(student),HttpStatus.OK);	
	}
	@GetMapping("/Student/Students")
	public List<Student> getAllStudent()
	{
		return sv.findAll();
	}
	
	@GetMapping("/Student/{sid}")
	public ResponseEntity<Student> getStudentDetails(@PathVariable("sid") int sid)
	{
		return new ResponseEntity<Student>(sv.getStudentDetails(sid),HttpStatus.OK);	
	}
	
	@PutMapping("/Student/{sid}")
	public ResponseEntity<Student> EditStudentDetails(@PathVariable("sid") int sid,@RequestBody Student student)
	{
		return new ResponseEntity<Student>(sv.editStudentDetails(student, sid),HttpStatus.OK);
		
	}
	
	@DeleteMapping("/Student/{sid}")
	public ResponseEntity<String> deleteStudentDetails(@PathVariable("sid") int sid){
		sv.deleteStudentDetails(sid);
		return new ResponseEntity<String>("Deleted Sucessfully...",HttpStatus.OK);
		
	}

}
