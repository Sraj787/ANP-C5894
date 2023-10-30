package com.SpringBoot.Curd.TeacherServiceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.Curd.Entity.Teacher;
import com.SpringBoot.Curd.Exception.TeacherIdNotFoundException;
import com.SpringBoot.Curd.repository.TeacherRepository;
import com.SpringBoot.Curd.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	TeacherRepository trepo;
	
	@Override
	public Teacher addTeacher(Teacher teacher) {
		
		return trepo.save(teacher);
	}

	@Override
	public Teacher getTeacherDetails(int tid) {
		return trepo.findById(tid).orElseThrow(()-> new TeacherIdNotFoundException("Teacher Id is not correct"));
	}

	@Override
	public Teacher updateTeacherDetails(Teacher teacher, int tid) {
		Teacher updatedTeacher = trepo.findById(tid).orElseThrow(()-> new TeacherIdNotFoundException("Teacher Id is not correct"));

		//set new values
		updatedTeacher.setTphone(teacher.getTphone());
		updatedTeacher.setDesignation(teacher.getDesignation());
		
		trepo.save(updatedTeacher); //saving updated details 
			return updatedTeacher;
	}

	@Override
	public void deleteTeacherDetails( int tid) {
		trepo.findById(tid).
		orElseThrow(()-> new TeacherIdNotFoundException("Teacher Id is not correct"));
	    trepo.deleteById(tid);
	}

	@Override
	public List<Teacher> findBytname(String tname) {
		// TODO Auto-generated method stub
		return trepo.findBytname(tname);
	}

	@Override
	public List<Teacher> findBydesignation(String designation) {
		// TODO Auto-generated method stub
		return trepo.findByDesignation(designation);
	}



	@Override
	public List<Teacher> FindBytphone(long tphone) {
		// TODO Auto-generated method stub
		return trepo.findBytphone(tphone);
	}

	

	

	

}
