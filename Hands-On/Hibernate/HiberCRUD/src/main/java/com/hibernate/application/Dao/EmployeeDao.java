package com.hibernate.application.Dao;

import java.util.List;

import com.hibernate.appliction.Entity.Employee;

//Dao= Data access object
public interface EmployeeDao {
	public void addEmp();
	public void deleteEmp(int id);
	List<Employee> getDisplayEmp();
	public void editEmp(int id);
	public void displayEmp(int id);
}
