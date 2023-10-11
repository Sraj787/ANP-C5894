package com.hibernate.application.config;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.hibernate.appliction.Entity.Employee;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory == null) {
			try {
				System.out.println("into a method");
				//Creating object of configuration class
				Configuration cfg = new Configuration();
				//Creating object of Properties class
				Properties setting = new Properties();//collection framework java version 1.2
				
				//Set the hibernate environment or set the properties value
				setting.put(Environment.DIALECT,"org.hibernate.dialect.MySQL8Dialect");
				setting.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
				setting.put(Environment.USER, "root");
				setting.put(Environment.PASS,"Sarthak@989");
				setting.put(Environment.HBM2DDL_AUTO, "update");
				
				setting.put(Environment.URL,"jdbc:mysql://localhost:3306/employee");
				setting.put(Environment.SHOW_SQL,"true");
				
				//Using setProperties method to set the properties of the hibernate configuration
				cfg.setProperties(setting);
				cfg.addAnnotatedClass(Employee.class);
				
				//Using the ServiceRegistry to call the object 
				ServiceRegistry serviceRegistry= new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
				System.out.println("Hibernate java config serviceRegistry Created");
				sessionFactory = cfg.buildSessionFactory(serviceRegistry);
				
				//Print statement
				System.out.println("Session Factory");
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		return sessionFactory;
		
	}
	
	public static Session getSession(){
		
		return getSessionFactory().openSession();
		 
		
	}

	public static Object getsessionFactory() {
		// TODO Auto-generated method stub
		return null;
	}
}
