package com.SpringBoot.Curd.Controller;

import java.util.List;
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

import com.SpringBoot.Curd.Entity.Teacher;
import com.SpringBoot.Curd.service.TeacherService;

@RestController
public class TeacherController {

	@Autowired
	TeacherService ts;
	
	//use post mapping to insert data 
	@PostMapping("/Teacher/addTeacher")
	public ResponseEntity<Teacher> saveTeacher(@RequestBody Teacher teacher)
	{
		return new ResponseEntity<Teacher>(ts.addTeacher(teacher),
				HttpStatus.OK);
	}
	
	//use get mapping to fetch data from db table
	@GetMapping("/Teacher/getTeacher/{tid}")
	public ResponseEntity<Teacher> getTeacher(@PathVariable("tid") int tid)
	{
		return new ResponseEntity<Teacher>(ts.getTeacherDetails(tid),HttpStatus.OK);
	}
	
	//use put mapping to edit existing data
	@PutMapping("/Teacher/editTeacher/{tid}")
	public ResponseEntity<Teacher> editTeacher(@PathVariable("tid") int tid, @RequestBody Teacher teacher)
	{
		return new ResponseEntity<Teacher>(ts.updateTeacherDetails(teacher, tid), HttpStatus.OK);
	}
	
	
	//use delete mapping to remove existing data
	@DeleteMapping("Teacher/removeTeacher/{tid}")
	public ResponseEntity<String> deleteTeacher(@PathVariable("tid") int tid)
	{
		ts.deleteTeacherDetails(tid);
		return new ResponseEntity<String>("Deleted Successfully..", HttpStatus.OK);
    }
	
	
	//use get mapping to fetch data from db table
	@GetMapping("/Teacher/getTeacherByname/{tname}")
	public ResponseEntity<List<Teacher>> getTeacherByName(@PathVariable("tname") String tname)
	{
		List<Teacher> teachers=ts.findBytname(tname);
		return new ResponseEntity<>(teachers,HttpStatus.OK);
	}
		
	@GetMapping("/Teacher/getTeacher/{designation}")
	public ResponseEntity<List<Teacher>> getTeacheByDesignation(@PathVariable("designation") String designation)
	{
	List<Teacher> teachers=ts.findBydesignation(designation);
	return new ResponseEntity<>(teachers,HttpStatus.OK);
	}
	
	@GetMapping("/Teacher/getTeacherByPhoneNo/{phone}")
	public ResponseEntity<List<Teacher>> getTeacherByPhone(@PathVariable("phone")long tphone)
	{
        List<Teacher> teachers=ts.FindBytphone(tphone);
		return new ResponseEntity<>(teachers,HttpStatus.OK);
	}
	
		
}

