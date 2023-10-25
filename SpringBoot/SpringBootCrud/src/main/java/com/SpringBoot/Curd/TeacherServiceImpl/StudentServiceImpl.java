package com.SpringBoot.Curd.TeacherServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.Curd.Entity.Student;
import com.SpringBoot.Curd.Exception.StudentIdNotFoundException;
import com.SpringBoot.Curd.repository.StudentRepository;
import com.SpringBoot.Curd.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository srepo;
	@Override
	public Student addStudent(Student student) {
		
		return srepo.save(student);
	}

	@Override
	public Student getStudentDetails(int sid) {
		// TODO Auto-generated method stub
		return srepo.findById(sid).orElseThrow(()->new StudentIdNotFoundException("Student id is incorrect"));
	}

	@Override
	public Student editStudentDetails(Student student, int sid) {
		Student updateStudent = srepo.findById(sid).orElseThrow(()->new StudentIdNotFoundException("Student id is incorrect"));
		
		updateStudent.setSAddress(student.getSAddress());
		updateStudent.setSEmail(student.getSEmail());
		
		return updateStudent;
	}

	@Override
	public void deleteStudentDetails(int sid) {
		
		srepo.findById(sid).
		orElseThrow(()->new  StudentIdNotFoundException("student id is incorrect"));
		srepo.deleteById(sid);
		
		
	}

}
