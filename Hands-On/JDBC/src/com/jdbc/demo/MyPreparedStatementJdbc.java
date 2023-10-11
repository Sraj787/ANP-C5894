package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MyPreparedStatementJdbc{
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver"); //step 1
		
		//step 2
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Sarthak@989");

		PreparedStatement pstmt=con.prepareStatement("insert into studenttable values(?,?,?,?,?)");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter the ID");
		int id=sc.nextInt();
		
		System.out.println("Please enter the Name");
		String name=sc.next();
		
		System.out.println("Please enter the Address");
		String address=sc.next();
		
		System.out.println("Please enter the Department");
		String dept =sc.next();
		
		System.out.println("Please enter the Mobile Number:");
		String mobile =sc.next();
		
		
		pstmt.setInt(1,id);
		pstmt.setString(2,name);
		pstmt.setString(3,address);
		pstmt.setString(4,dept);
		pstmt.setString(5,mobile); // create statement // 3 step
		
		int i=pstmt.executeUpdate(); // 4 step // execute query
		System.out.println("Student data added successfully");
		//con.close();
		
		
	}

	

}
