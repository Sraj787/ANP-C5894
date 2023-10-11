package com.hibernate.application.Daoimpl;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hibernate.application.Dao.EmployeeDao;
import com.hibernate.application.config.HibernateUtil;
import com.hibernate.appliction.Entity.Employee;

public class EmployeDaoImpl implements EmployeeDao{

	
	Scanner sc = new Scanner(System.in);
	@Override
	public void addEmp() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		String empName,surname,address,designation;
		long phone;
		System.out.println("Enter the Name:");
		empName = sc.next();
		System.out.println("Enter the Surname:");
		surname = sc.next();
		System.out.println("Enter the Address");
		address = sc.next();
		System.out.println("Enter the Designation:");
		designation = sc.next();
		System.out.println("Enter the Mobile Number:");
		phone = sc.nextLong();
		
		Employee emp = new Employee();
		emp.setEmpFirstName(empName);
		emp.setEmpLastName(surname);
		emp.setAddress(address);
		emp.setDesignation(designation);
		emp.setEmpPhone(phone);
		
		session.save(emp);
		tx.commit();
		session.close();
		System.out.println("Adding Data SuccessFully");
	}

	@Override
	public void deleteEmp(int id) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Employee emp = session.get(Employee.class, id);
		
		session.delete(emp);
		tx.commit();
		session.close();
		System.out.println("Employee Details deleted");
		
	}

	@Override
	public void editEmp(int id) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		System.out.println("1.EditName 2.EditSurname 3.EditAddress 4.EditDesignation 5.MobileNo");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:{
			//Name
			System.out.println("Enter the Employee id");
			Employee emp = session.get(Employee.class, id);
			System.out.println("Enter the new name:");
			emp.setEmpFirstName(sc.next());
			session.save(emp);
			tx.commit();
			session.close();
		}
		case 2:{
			System.out.println("Enter the Employee id");
			Employee emp = session.get(Employee.class, id);
			System.out.println("Enter the new name:");
			emp.setEmpLastName(sc.next());
			session.save(emp);
			tx.commit();
			session.close();
		}
		case 3:{
			System.out.println("Enter the Employee id");
			Employee emp = session.get(Employee.class, id);
			System.out.println("Enter the new address:");
			emp.setAddress(sc.next());
			session.save(emp);
			tx.commit();
			session.close();
			
		}
		case 4:{
			System.out.println("Enter the Employee id");
			Employee emp = session.get(Employee.class, id);
			System.out.println("Enter the new desingnation:");
			emp.setDesignation(sc.next());
			session.save(emp);
			tx.commit();
			session.close();
		}
		case 5:{
			System.out.println("Enter the Employee id");
			Employee emp = session.get(Employee.class, id);
			System.out.println("Enter the new mobile number:");
			emp.setEmpPhone(sc.nextLong());;
			session.save(emp);
			tx.commit();
			session.close();
			
		}
		default :{
			System.out.println("Enter the valid input:");
		}
		}		
	}

	
	@Override
	public void displayEmp(int id) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Employee emp = session.get(Employee.class, id);
		System.out.println("Employee Id :"+emp.getEmpId());
		System.out.println("Name :"+emp.getEmpFirstName());
		System.out.println("Surname :"+emp.getEmpLastName());
		System.out.println("Address :"+emp.getAddress());
		System.out.println("Desingnation :"+emp.getDesignation());
		System.out.println("Mobile No :"+emp.getEmpPhone());
		tx.commit();
		session.close();
		System.out.println("Data Display Done:");	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getDisplayEmp() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		
		@SuppressWarnings("rawtypes")
		Query quary = session.createNamedQuery("DisplayAll");
		List<Employee> list1 = quary.getResultList();
		Iterator<Employee> it = list1.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println("Employee Id :"+emp.getEmpId());
			System.out.println("Name :"+emp.getEmpFirstName());
			System.out.println("Surname :"+emp.getEmpLastName());
			System.out.println("Address :"+emp.getAddress());
			System.out.println("Desingnation :"+emp.getDesignation());
			System.out.println("Mobile No :"+emp.getEmpPhone());
		}
		tx.commit();
		session.close();
		System.out.println("Data Display Done:");
		return list1;
	}
}
