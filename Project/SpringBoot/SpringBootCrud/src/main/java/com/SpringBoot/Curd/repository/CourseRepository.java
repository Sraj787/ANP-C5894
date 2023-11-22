package com.SpringBoot.Curd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBoot.Curd.Entity.Courses;

public interface CourseRepository extends JpaRepository<Courses, Integer> {

}
