package com.anudip.hiberdemo;

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
    	System.out.println( "Connection started" );
       Configuration cfg=new Configuration();
       cfg.configure("hibernate.cfg.xml");
       
       SessionFactory factory=cfg.buildSessionFactory();// session factory created
       Session session=factory.openSession(); // i have open the session to store student object
       Transaction tx=session.beginTransaction();
       
       Student st=new Student();
       st.setStudId(2);
       st.setStudName("Sami");
       st.setStudMarks("80");
       
       session.save(st);
      
       tx.commit();
       session.close();
       System.out.println("Student object save hua");
       
       
       
       
       
    }
}
