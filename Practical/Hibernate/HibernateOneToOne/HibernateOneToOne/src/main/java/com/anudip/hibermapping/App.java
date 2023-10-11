package com.anudip.hibermapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/*
 * relationship in two object in java is achive by 1 Is-A relationship -
 * inheritance 2 has-A realationship - Asscociation
 * 
 * Aggregation - object are tighly depend on each other - car and engine - one
 * to one Composition - Object are loosly depend on each other - Bank and ATM -
 * one to many many to one many to many
 */
public class App 
{
    public static void main( String[] args )
    {
       Configuration cfg=new Configuration();
       cfg.configure("hibernate.cfg.xml");
       SessionFactory factory=cfg.buildSessionFactory();// session factory created
       Session session=factory.openSession();
       Transaction tx=session.beginTransaction();
       
       Husband h1=new Husband();
       Wife w1=new Wife();
       
       h1.sethName("Ranvir");
       h1.setWife(w1);
       
       w1.setwName("Aliya");
       w1.setHusband(h1);
       
       session.save(w1);
       session.save(h1);
       
       tx.commit();
       session.close();
       
       
       
       


       
       
       
       
    }
}
