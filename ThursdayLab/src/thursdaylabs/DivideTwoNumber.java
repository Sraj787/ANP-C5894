package thursdaylabs;
/*
 2.Write a program that attempts to divide two numbers. 
 Whether the division is successful or not, make sure to display a "Division completed" message. 
 Ensure that the division operation is performed in a try block and the "Division completed" message is displayed in a finally block.
 */
import java.util.Scanner;
public class DivideTwoNumber 
{

	public static void main(String[] args) 
	{
		
		//Creating Scanner class object
		Scanner sc=new Scanner(System.in);
		
		//Print Statement to Enter the integer number
		System.out.println("Enter the 1st number: ");
		//Get the first input from the user
		int num1=sc.nextInt();
		
		//Print Statement to Enter the integer number
		System.out.println("Enter the 2nd number: ");
		//Get the second input from the user
		int num2=sc.nextInt();
		
		//try block using to identify the the exception or write the logic 
		try 
		{
			//Divide the both input each other 
			float result=(float)num1/num2;
			//Print the result
			System.out.println("Result: " + result);
		}
		//catch block to handle the exception 
		catch(ArithmeticException e) 
		{
			//Display the exception message 
			System.out.println("Exception is caught: "+e.getMessage());
		}
		//finally block always execute
		finally 
		{
			//Print the message 
			System.out.println("Division Completed:");
		}	
		//Scanner class close
		sc.close();
	}

}
