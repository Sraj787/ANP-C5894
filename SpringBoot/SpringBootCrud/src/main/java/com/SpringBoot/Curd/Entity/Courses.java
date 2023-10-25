package com.SpringBoot.Curd.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data //for getter setter method
public class Courses {

	@Id
	private int cId;
	
	@Column(length=20,nullable = false)
	@NotBlank(message="CourseName cannot be blank")
	private String courseName;
	
	@Column(length=8,nullable = false)
	@NotBlank(message="Course duration cannot be blank")
	private String duration;
	
	@Column(length=10,nullable = false)
	@NotNull(message="CourseFees cannot be blank")
	private double courseFees;
	
	
	@OneToOne(mappedBy = "courses",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JsonBackReference
	List<Student> studentList;
	
	
	
}
