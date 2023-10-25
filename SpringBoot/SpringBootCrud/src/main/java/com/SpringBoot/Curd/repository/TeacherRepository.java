package com.SpringBoot.Curd.repository;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.SpringBoot.Curd.Entity.Teacher;

//JPA repository for crud method

public interface TeacherRepository extends JpaRepository<Teacher, Integer>{

	/*List<Teacher> findBytphone(long tphone);
	List<Teacher> findBytname(String tname);
	List<Teacher> findByDesignation(String designation);*/

}
