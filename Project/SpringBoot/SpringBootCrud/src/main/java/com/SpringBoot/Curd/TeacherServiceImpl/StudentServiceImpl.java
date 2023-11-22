package com.SpringBoot.Curd.TeacherServiceImpl;

import java.util.List;

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
		return srepo.findById(sid).orElseThrow(()->new StudentIdNotFoundException("Student id is incorrect"));
	}

	@Override
	public Student editStudentDetails(Student student, int sid) {
		Student updateStudent = srepo.findById(sid).orElseThrow(()->new StudentIdNotFoundException("Student id is incorrect"));
		
		updateStudent.setSfirstname(student.getSfirstname());
		updateStudent.setSurname(student.getSurname());
		updateStudent.setSeduc(student.getSeduc());
		updateStudent.setSaddress(student.getSaddress());
		updateStudent.setSemail(student.getSemail());
		
		srepo.save(updateStudent);
		return updateStudent;
	}

	@Override
	public void deleteStudentDetails(int sid) {
		
		srepo.findById(sid).
		orElseThrow(()->new  StudentIdNotFoundException("student id is incorrect"));
		srepo.deleteById(sid);
		
		
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return srepo.findAll();
	}

}
