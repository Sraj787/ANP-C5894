package com.anudip.hiberdemo;

import javax.persistence.Column;
import javax.persistence.Entity; //JPA//Specification
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="Student_Details")
public class Student {

	@Id
	private int studId;
	@Column
	private String studName;
	@Column
	private String studMarks;
	
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getStudMarks() {
		return studMarks;
	}
	public void setStudMarks(String studMarks) {
		this.studMarks = studMarks;
	}
	
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studMarks=" + studMarks + "]";
	}
	
	
	
	
}
