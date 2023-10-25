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

import com.SpringBoot.Curd.Entity.Courses;
import com.SpringBoot.Curd.service.CourseService;

@RestController
public class CoursesController {

	@Autowired
	CourseService cs;
	
	@PostMapping("/Course/addCourse")
	public ResponseEntity<Courses> addCourseDeatails(@RequestBody Courses course){
		return new ResponseEntity<Courses>(cs.addCourse(course), HttpStatus.OK);	
	}
	@GetMapping("/Course/getCourse/{cId}")
	public ResponseEntity<Courses> getCourseDetails(@PathVariable("cId")int cId){
		return new ResponseEntity<Courses>(cs.getCoursedetails(cId),HttpStatus.OK);	
	}
	@GetMapping("/Course/allCourse")
	Iterable<Courses> getAllCourse(){
		return cs.getAllCourseDeatils();	
	}
	@PutMapping("/Course/ediCourse/{cId}")
	public ResponseEntity<Courses> editCourseDetaals(@PathVariable("cId")int cId,@RequestBody Courses course){
		return new ResponseEntity<Courses>(cs.updateCourseDeatils(course, cId),HttpStatus.OK);
		
	}
}
