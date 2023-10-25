package com.SpringBoot.Curd.service;

import java.util.List;

import com.SpringBoot.Curd.Entity.Courses;

public interface CourseService {
	
	public Courses addCourse(Courses course);
	
	public Courses getCoursedetails(int cId);
	
	public Courses updateCourseDeatils(Courses course,int cId);
	
	List<Courses> getAllCourseDeatils();
	

}
