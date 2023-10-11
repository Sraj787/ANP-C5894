package com.hibernate.StudentDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
        SessionFactory factory= cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        
        Student st = new Student();
        st.setId(1);
        st.setName("Sarthak");
        st.setStd(10);
        st.setDivision("A");
        
        Student st1 = new Student();
        st1.setId(2);
        st1.setName("vipin");
        st1.setStd(9);
        st1.setDivision("A");
        
        session.save(st);
        session.save(st1);
        tx.commit();
        session.close();
        
        System.out.println("Data updated");
    }
}
