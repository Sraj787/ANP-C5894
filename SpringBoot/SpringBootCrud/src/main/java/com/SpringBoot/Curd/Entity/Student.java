package com.SpringBoot.Curd.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Table(name="Student_info")
@Data
public class Student {

	@Id
	private int sid;
	
	@Column(length=25,nullable = false)
	@NotBlank(message="Student firsname cannot be black" )
	private String sFirstName;
	
	@Column(length=25,nullable = false)
	@NotBlank(message="Student surname cannot be blank")
	private String surname;
	
	@Column(length=25,nullable = false,unique = true)
	private long sphone;
	
	@Column(length=25,nullable = false,unique = true)
	@NotBlank(message="Student email cannot be blank")
	@Email(message="Email is incorrect")
	private String sEmail;
	
	@Column(length=25,nullable = false)
	@NotBlank(message="Student Eduction cannot be blank")
	private String sEduc;
	
	@Column(length=50,nullable = false)
	@NotBlank(message="Student Address cannot be blank")
	private String sAddress;
	
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "courseID", referencedColumnName = "cId")
	@JsonBackReference
	private Courses courses;
	
	
}
