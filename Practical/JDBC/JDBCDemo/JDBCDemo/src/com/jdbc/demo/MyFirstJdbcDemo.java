package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstJdbcDemo{

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver"); //step 1
		
		//step 2
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/meradb", "root", "root");
		
		//step 3
		Statement stmt=con.createStatement();
		
		//step 4 execute Statement
		
		int a=stmt.executeUpdate("insert into employee values(4,'Sakshi','VicePresident','Mechanical',334545)");
		
		System.out.println("Successfully added employee" +a);
		 //step 5
		con.close();
		
	}

}
