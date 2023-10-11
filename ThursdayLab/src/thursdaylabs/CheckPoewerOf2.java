package thursdaylabs;
/*
3.Write a Java program that takes an integer input from the user and 
checks if it is a power of 2 using bitwise operators.
 Print "Yes" if it is a power of 2, and "No" otherwise. 
 */

//Java program to check the input number is a power of 2 or not using bitwise operator AND
//import the java packages
import java.util.*;

public class CheckPoewerOf2 
{

	public static void main(String[] args) 
	{
		//Scanner class object
		Scanner sc = new Scanner(System.in);
		
		//print Statement to Enter the integer number 
		System.out.println("Enter the Number: ");
		
		//Store the input integer number in this variable
		int number=sc.nextInt();
		
		//input number subtract with 1 or store the value in this variable
		int check = number-1;
		
		//Using AND Operator to check the number is power of 2 or not
		int isPower= number & check;
		
		//if statement basically use for to check isPower of all bit value 0 or not;
		if(isPower==0) 
		{
			//print isPower of all bit value  is 0
			System.out.println("Yes");
		}
		else 
		{
			//print the statement isPower of all bit value are not 0
			System.out.println("No");
		}
		
		//close Scanner class
		sc.close();

	}

}
