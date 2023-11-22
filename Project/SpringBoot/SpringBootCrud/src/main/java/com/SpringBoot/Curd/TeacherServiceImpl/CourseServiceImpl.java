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
	public Courses getCoursedetails(int cid) {
		
		return crepo.findById(cid).orElseThrow(()->new CourseIdNotFoundException("course id is incorrect"));
	}

	@Override
	public Courses updateCourseDeatils(Courses course, int cid) {
		Courses updateCourse = crepo.findById(cid).orElseThrow(()->new CourseIdNotFoundException("Course id is incorrect"));
		
		updateCourse.setCourseName(course.getCourseName());
		updateCourse.setCourseName(course.getCourseName());
		updateCourse.setDuration(course.getDuration());
		crepo.save(updateCourse);
		return updateCourse;
	}

	@Override
	public List<Courses> getAllCourseDeatils() {
		// TODO Auto-generated method stub
		return crepo.findAll();
	}

}
