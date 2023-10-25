package com.SpringBoot.Curd.TeacherServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.Curd.Entity.Courses;
import com.SpringBoot.Curd.Exception.CourseIdNotFoundException;
import com.SpringBoot.Curd.repository.CourseRepository;
import com.SpringBoot.Curd.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	CourseRepository crepo;
	
	@Override
	public Courses addCourse(Courses course) {
		// TODO Auto-generated method stub
		return crepo.save(course);
	}

	@Override
	public Courses getCoursedetails(int cId) {
		
		return crepo.findById(cId).orElseThrow(()->new CourseIdNotFoundException("course id is incorrect"));
	}

	@Override
	public Courses updateCourseDeatils(Courses course, int cId) {
		Courses updateCourse = crepo.findById(cId).orElseThrow(()->new CourseIdNotFoundException("Course id is incorrect"));
		
		updateCourse.setCourseName(updateCourse.getCourseName());
		updateCourse.setCourseName(updateCourse.getCourseName());
		updateCourse.setDuration(updateCourse.getDuration());
		
		return crepo.save(updateCourse);
	}

	@Override
	public List<Courses> getAllCourseDeatils() {
		// TODO Auto-generated method stub
		return crepo.findAll();
	}

}
