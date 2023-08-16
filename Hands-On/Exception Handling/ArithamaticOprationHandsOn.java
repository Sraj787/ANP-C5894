package ExceptionHandling;
/*
 Hands-on:Write a program that takes two numbers and an operator (+, -, *, /) from the user. 
 Perform the corresponding arithmetic operation and display the result.
  Handle exceptions for invalid operators and division by zero.
 */
import java.util.Scanner;
public class ArithamaticOprationHandsOn 
{

	public static void main(String[] args) 
	{
		//Creating Scanner class object 
		Scanner sc= new Scanner(System.in);
		   
		//Print statement To enter the 1st number
		System.out.println("Enter the 1st number: ");
		//Get the 1st input value from the user
		int num1=sc.nextInt();
			
		//Print statement to enter the 2nd number
		System.out.println("Enter the 2nd number: ");
		//Get the 2nd input value from the user
		int num2=sc.nextInt();
		
		try
		{
			//Adding the both numbers
			int sum = num1 + num2;
			//Display the sum of both numbers
			System.out.println("Sum of Two number is: "+sum);
			
			//Subtract the both numbers
			int sub = num1 - num2;
			//Display the result of subtraction
			System.out.println("Substract of Both number is: "+sub);
			
			//Multiply the both numbers
			int mul = num1*num2;
			//Display the result of the multiplication
			System.out.println("Mutiplication of both number Result is: "+mul);
			
			//Divide the both numbers
			int divide = num1 / num2;
			//Display the result of the division
			System.out.println("Division of both number is: "+divide);
		
		}
		//Received the Arithmetic exception
		catch(ArithmeticException e)
		{
			//Display the after getting exception
			System.out.println("An exception occurred: "+e.getMessage());	
		}
		//Scanner class close
		sc.close();
	}

}
