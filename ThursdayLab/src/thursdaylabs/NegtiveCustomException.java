package thursdaylabs;
/*
 lab 1:Write a program that takes an integer input from the user and throws this custom exception if the input is negative.
  Catch the exception and display an error message accordingly.
 */

import java.util.Scanner;
@SuppressWarnings("serial")

//Creating the custom exception
//Exception class is super class or myCustomException is base class
class MyCustomException extends Exception 
{
	public MyCustomException(String msg) 
	{
		//call the default constructor of the exception
		super(msg);
	}
}
public class NegtiveCustomException 
{
	//Suppress the resource because of the Scanner class is leak
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		
		//Creating object of scanner class
		Scanner sc= new Scanner(System.in);

		//Print statement
		System.out.println("Enter the Number: ");

		//Get input the number from user
		int number = sc.nextInt();
		
		//try & catch block using to handle the exception
		//In a try Write the logic code or throw the exception to the catch block
		try {
			//If number is negative than throw the exception to catch block
			if(number<0) 
			{
			throw new MyCustomException("Negative number is not allowed:");
			}
			//If number is positive the print the result
			System.out.println("Positive number is allowed: "+number);
		}
		//Get the Exception from the try block or handle
		catch(MyCustomException e) {
			System.out.println("Exception caught!"+e.getMessage());
		}
		//Scanner class close
		sc.close();	
	}

}
