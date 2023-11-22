package com.SpringBoot.Curd.service;

import java.util.List;

import com.SpringBoot.Curd.Entity.Student;

public interface StudentService {
	
	Student addStudent(Student student);
	
	Student getStudentDetails(int sid);
	
	Student editStudentDetails(Student student, int sid);
	
	void deleteStudentDetails(int sid);

	List<Student> findAll();

	

}
