package com.SpringBoot.Curd.service;

import com.SpringBoot.Curd.Entity.Student;

public interface StudentService {
	
	Student addStudent(Student student);
	
	Student getStudentDetails(int sid);
	
	Student editStudentDetails(Student student, int sid);
	
	void deleteStudentDetails(int sid);

}
