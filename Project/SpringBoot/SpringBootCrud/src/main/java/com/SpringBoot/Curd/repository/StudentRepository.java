package com.SpringBoot.Curd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBoot.Curd.Entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

}
