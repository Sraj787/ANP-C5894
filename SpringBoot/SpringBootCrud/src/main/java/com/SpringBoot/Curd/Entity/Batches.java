package com.SpringBoot.Curd.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Batches {

	@Id
	private int bid;

	@Column(length=25,nullable = false)
	@NotBlank(message="Student bname cannot be black" )
	private String bname;
	
	@Column(length=25,nullable = false)
	@NotBlank(message="Student subject cannot be black" )
	private String subject;
	
	@Column(length=25,nullable = false)
	@NotBlank(message="Student startdate cannot be black" )
	private String startdate;
	
	@Column(length=25,nullable = false)
	@NotBlank(message="Student enddate cannot be black" )
	private String enddate;
	
	@Column(length=10,nullable = false)
	@NotNull(message="CourseFees cannot be blank")
	private int duration;
	
	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name="TeacherId",referencedColumnName = "tid")
	@JsonBackReference
	private Teacher teacher;
}
