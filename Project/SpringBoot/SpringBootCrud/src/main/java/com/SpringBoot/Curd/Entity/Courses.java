package com.SpringBoot.Curd.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data //for getter setter method
public class Courses {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	
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
	@JsonManagedReference
	private Student student;
	
	
	
}
