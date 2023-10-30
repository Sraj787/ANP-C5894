package com.SpringBoot.Curd.service;

import java.util.List;
import com.SpringBoot.Curd.Entity.Teacher;

public interface TeacherService {

	Teacher addTeacher(Teacher teacher);
	
	Teacher getTeacherDetails(int tid);
	
	Teacher updateTeacherDetails(Teacher teacher,int tid);
	
	void deleteTeacherDetails(int tid);
	

	List<Teacher> findBytname(String tname);

	List<Teacher> findBydesignation(String designation);

	List<Teacher> FindBytphone(long tphone);
	


}
