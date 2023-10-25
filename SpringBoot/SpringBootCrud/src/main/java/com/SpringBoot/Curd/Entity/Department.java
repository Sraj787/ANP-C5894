package com.SpringBoot.Curd.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Table(name="Department_info")
@Data //for getter setter method
public class Department {

	@Id
	private int dId;
	
	@Column(length=25,nullable = false)
	@NotBlank(message="Department name cannot be blank")
	private String dname;
	
	@Column(length=25,nullable = false)
	private String dhod;
	
	@Column(length=25,nullable = false)
	@NotNull(message="kindly mention No of Employee")
	private int noOfEmployee;

	@OneToMany(mappedBy = "department",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JsonBackReference
	List<Teacher> teacherList;

	
}
