package com.anudip.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Configuration cfg=new Configuration();
      cfg.configure("hibernate.cfg.xml");
      
      SessionFactory factory=cfg.buildSessionFactory();
      Session session=factory.openSession();
      Transaction tx=session.beginTransaction();
      
      Employee emp1=new Employee();
      emp1.setEmpId(003);
      emp1.setEmpName("Sanjay");
      emp1.setEmpDept("IT");
      emp1.setEmpDesig("Anyalist");
      emp1.setSalary(239030.8);
      
      Employee emp2=new Employee();
      emp2.setEmpId(004);
      emp2.setEmpName("Rutik");
      emp2.setEmpDept("CS");
      emp2.setEmpDesig("Sr.Manager");
      emp2.setSalary(344030.8);
      
      session.save(emp1);
      session.save(emp2);
      tx.commit();
      session.close();
      System.out.println("Employee ka data add hua....");
      
    }
}
