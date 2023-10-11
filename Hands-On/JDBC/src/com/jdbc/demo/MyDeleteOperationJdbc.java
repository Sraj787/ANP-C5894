package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MyDeleteOperationJdbc{
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver"); //step 1
		
		//step 2
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Sarthak@989");

		Statement stmt = con.createStatement(); 
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the ID");
		int stdid=sc.nextInt();
		String query  = "DELETE FROM studenttable " +
	            "WHERE stdid";
		int result = stmt.executeUpdate(query); 
		
		
	        if (result == 0) { 
	            System.out.println("record not found to delete"); 
	        } else { 
	            System.out.println(result+" no.of record(s) found and deleted"); 
	        } 
	        con.commit();
	        sc.close();
	        stmt.close();
	        
		
		
	}

	

}
