package loops;
/*
 Write a Java program that takes a year as input and checks if it is a leap year.
 If the year is divisible by 4, check if it is also divisible by 100. 
 If it is divisible by 100, check if it is also divisible by 400. 
 Print "Leap Year" if it satisfies all the conditions, and "Not a Leap Year" otherwise.
 */
import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		//Scanner class to take the input from user
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the year:");
		//integer input from the user
		int year=sc.nextInt();
		
	//Conditions
	if(year%4==0) 
	{
		System.out.println("Leap Year");
	}
	else if(year%100==0)
	{
		System.out.println(" Leap Year");
	}
	else if(year%400==0)
	{
		
		System.out.println("Leap Year");
	}
	else 
	{
		System.out.println("Not a leap year");
	}
	//closing Scanner class
	sc.close();
	}

}
