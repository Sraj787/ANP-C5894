package thursdaylabs;

//Question 2:
/*
 Write a Java program that prompts the user to enter a number and
 then prints the multiplication table of that number using a for loop.
 The table should display multiplication from 1 to 10.
 */

//Import the java package
import java.util.*;

public class MultiplicationTable 
{
	public static void main(String[] args) 
   {
		
		//Scanner class to take input from the user		
	Scanner sc=new Scanner(System.in);
	
	   //printing the statement
	System.out.println("Enter The Number To Get Multiplication Table:");
	
      // getting the input from the user 	
	int num = sc.nextInt();
	
	  //initialize table is 1
	int Table=1;
	System.out.println("Multiplication Table of "+num+" is:");
	
      //Using For loop	
	for(int i=1;i<=10;i++) {
		
		            Table = num*i;
		            //Print the table of given number
		            System.out.println(num+"*"+i+"="+Table);
		            
                           }
	  //closing the Scanner class
	sc.close();
	
   }	
}
