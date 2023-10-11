package com.jdbc.demo;
/*Question 1.
 Create CRUD operation for student details accepting the input from user for confirming the operation.
 1.Enter the student details
 2.Retrieve the students 
 3.delete the students details
 4.Edit the students details
 */

//import the packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//Main class
public class CRUDOperation {

	//Main method
	public static void main(String[] args){
		
		//Creating object of scanner
		Scanner sc = new Scanner(System.in);

		//statement for operations
		System.out.println("1.Enter the student details");
		System.out.println("2.Retrieve the students");
		System.out.println("3.delete the students details");
		System.out.println("4.Edit the students details");
		//variable declare for operation
		int operation = sc.nextInt();
		
		//Using switch condition to perform the task
		switch(operation) {
		//Operation to enter student details
		case 1:
			InsertData.InsertDataMethod();
			break;
		//Operation to retrieve student details	
		case 2:
			ReadData.ReadDataMethod();
			break;
		//Operation to delete student details	
		case 3:
			DeleteData.DeleteDataMethod();  
		    break;
		//Operation to edit student details    
		case 4:
			EditData.EditDataMethod();
			break;
		//Default Operation  
		default:
			//print statement
			System.out.println("Enter the valid input:");	
		}
	}
}

//Creating InsertData class
class InsertData{
	//Create InsertDataMethod for Insert the data into database
	public static void InsertDataMethod() {
		Scanner sc = new Scanner(System.in);
		try {
		
		//Step1	call the class for jdbc connection
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step2	make connection between database or code
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Sarthak@989");

		//Step3 prepared the statement		
		PreparedStatement pstmt=con.prepareStatement("insert into studenttable values(?,?,?,?,?)");
		
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
		pstmt.setString(5,mobile);
		
		//Step4 execute query
		int i=pstmt.executeUpdate(); 
		System.out.println("Student data added successfully");
		
		//Step5 close the connection
		con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();	
	}
}

//Creating read class to read the data from database
class ReadData{
	//Create ReadDataMethod for read the data from database
	public static void ReadDataMethod() {
		
		try {
		//Step 1 call the class for jdbc connection 
		Class.forName("com.mysql.cj.jdbc.Driver");
		 
		
		//Step 2 make connection between database or code
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Sarthak@989");
		
		//Step 3 prepared the statement	
		Statement stmt=con.createStatement();
		int stdid;
		String name ,address, dept ,mobile;
		//Step 4 execute query
		ResultSet rs=stmt.executeQuery("select * from studenttable"); 
		System.out.println("Student Details");
		System.out.println("================");
		System.out.println("id"+"  "+"name"+"  "+"address"+"  "+"dept"+"  "+"mobile" ); 
		while(rs.next())
		{
			  stdid   = rs.getInt(1);
			  name = rs.getString(2);
			  address= rs.getString(3);
			  dept = rs.getString(4);
			  mobile = rs.getString(5);
			 
			System.out.println( stdid+"   "+name+"    "+address+"    "+dept+"    "+mobile );	
		}
		//Step 5 close the connection
		con.close();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
//Creating DeleteData class 
class DeleteData{
	//Create DeleteDataMethod for Delete the data from database
	public static void DeleteDataMethod() {
		Scanner sc = new Scanner (System.in);
		try {
		//Step 1	call the class for jdbc connection 	
		Class.forName("com.mysql.cj.jdbc.Driver");
		 
		//Step 2	make connection between database or code
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Sarthak@989");
		con.setAutoCommit(false);
		
		//Step 3 prepared the statement	
		Statement stmt = con.createStatement(); 
		
		System.out.println("Please enter the student id:");
		int stdid = sc.nextInt();
		
		//Step 4 execute query
		String query = "DELETE from studenttable where stdid='"+stdid+"'"; 
		int result = stmt.executeUpdate(query); 
		
		con.commit(); 
	        if (result == 0) { 
	            System.out.println("record not found to delete"); 
	        } else { 
	            System.out.println(result+" no.of record(s) found and deleted"); 
	        }
	    //Step 5 close the connection
	    con.close(); 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}
}
class EditData{
	public static void EditDataMethod() {
		Scanner sc = new Scanner (System.in);
		
		//System.out.println("Enter the id you want to edit");
		//int id1 = sc.nextInt();
		//System.out.println("Please enter the update.");
		//String updatedetails = sc.next();
		
		//Print statement
		System.out.println("1.name");
		System.out.println("2.address");
		System.out.println("3.dept");
		System.out.println("4.mobileNo");
	
		//Get input from the user
		int operation = sc.nextInt();
		System.out.println("Please enter the update.");
		//Using switch condition to perform the required task
		switch(operation) {
		
		case 1:
			//Edit the name in student table
			EDIT.NameEdit(sc.next(), sc.nextInt());
			break;
		case 2:
			//Edit the address in student table
			EDIT.AddressEdit(sc.next(), sc.nextInt());
			break;
		case 3:
			//Edit the dept in student table
			EDIT.DeptEdit(sc.next(), sc.nextInt());
			break;
		case 4:
			//Edit the mobile in student table
			EDIT.MobileNoEdit(sc.next(), sc.nextInt());
			break;
		default:
			System.out.println("Please Enter valid input");
		}
		sc.close();
	}
}

//Create Edit class for editing the table 
class EDIT {

	//Create NameEditMethod for Editing the name in database
	public static void NameEdit(String name,int id) {
        Scanner sc = new Scanner (System.in);
		
		try {
		//Step 1	call the class for jdbc connection		
		Class.forName("com.mysql.cj.jdbc.Driver");
			 
		//Step 2	make connection between database or code
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Sarthak@989");
        
		//Step 3 prepared the statement	
		PreparedStatement pstmt=con.prepareStatement("Update studenttable set name=?  where stdid=?");
		
		//Step 4 execute query
		pstmt.setString(1,name);
		pstmt.setInt(2, id);
		pstmt.executeUpdate();
		System.out.println("Update is Done");
		
		//Step 5 close the connection
		con.close();
		} catch (ClassNotFoundException e) 
		{
				// TODO Auto-generated catch block
				e.printStackTrace();
		} catch (SQLException e) 
		{
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		sc.close();	
	}
	
	//Create AddressEditMethod for Editing the name in database
    public static void AddressEdit(String address,int id) {
        Scanner sc = new Scanner (System.in);
		
		try {
		//Step1	call the class for jdbc connection	
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 2 make connection between database or code
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Sarthak@989");
        
		//Step 3 prepared the statement	
		PreparedStatement pstmt=con.prepareStatement("Update studenttable set  address=? where stdid=?");
		
		//Step 4 execute query
		pstmt.setString(1,address);
		pstmt.setInt(2, id);
		pstmt.executeUpdate();
		System.out.println("Update is Done");
		
		//Step 5 close the connection
		con.close();
		} catch (ClassNotFoundException e) 
		{
				// TODO Auto-generated catch block
				e.printStackTrace();
		} catch (SQLException e) 
		{
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		sc.close();		
    }
    
  //Create DeptEditMethod for Editing the name in database
    public static void DeptEdit(String dept,int id) {
        Scanner sc = new Scanner (System.in);
		
		try {
		//Step 1 call the class for jdbc connection		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 2 make connection between database or code	 
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Sarthak@989");
        
		//Step 3 prepared the statement	
		PreparedStatement pstmt=con.prepareStatement("Update studenttable set  dept=?  where stdid=?");
		
		//Step 4 execute query
		pstmt.setString(1,dept);
		pstmt.setInt(2, id);
		pstmt.executeUpdate();
		System.out.println("Update is Done");
		
		//Step 5 close the connection
		con.close();
		} catch (ClassNotFoundException e) 
		{
				// TODO Auto-generated catch block
				e.printStackTrace();
		} catch (SQLException e) 
		{
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		sc.close();
		
}
	
  //Create MobileEditMethod for Editing the name in database
    public static void MobileNoEdit(String mobile,int id) {
        Scanner sc = new Scanner (System.in);
		
		try {
		//Step 1 call the class for jdbc connection	
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 2 make connection between database or code	 
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Sarthak@989");
        
		//Step 3 prepared the statement	
		PreparedStatement pstmt=con.prepareStatement("Update studenttable mobileNo=? where stdid=?");
		
		//Step 4 execute query
		pstmt.setString(1,mobile);
		pstmt.setInt(2, id);
		pstmt.executeUpdate();
		System.out.println("Update is Done");
		
		//Step 5 close the connection
		con.close();
		} catch (ClassNotFoundException e) 
		{
				// TODO Auto-generated catch block
				e.printStackTrace();
		} catch (SQLException e) 
		{
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		sc.close();
    }
	
}

