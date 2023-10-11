package com.hibernate.ParentChildProject;

import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Parent p1 = new Parent();
		p1.setpId(1);
		p1.setpName("Amitabh");
		
		Child ch1 = new Child();
		ch1.setcId(1);
		ch1.setcName("Abhishek");
		ch1.setParent(p1);

		Child ch2 = new Child();
		ch2.setcId(2);
		ch2.setcName("sakshi");
		ch2.setParent(p1);

		HashSet<Child> childset = new HashSet<Child>();
		childset.add(ch1);
		childset.add(ch2);

		session.save(ch1);
		session.save(ch2);

		p1.setChild(childset);

		session.save(p1);

		tx.commit();
		session.close();
		System.out.println("Data store ho gaya");
	}
}
