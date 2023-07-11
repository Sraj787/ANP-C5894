package loops;
/*
Write a Java program that takes an integer as
input and checks if it is divisible by 2, 3, or both.
Print "Divisible by 2" if it is divisible by 2, "Divisible by 3" if it is divisible by 3,
and "Divisible by both 2 and 3" if it is divisible by both.
 */
import java.util.*;

public class Check 
{

	public static void main(String[] args) 
{
		//Scanner class to take input from the user
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		
		//integer input from the user 
		int value= sc.nextInt();
		
		//Condition
		if (value%2==0 && value%3==0) 
		{
			System.out.println("Divsible by Both");
		}
		else if(value%2==0) 
		{
			System.out.println("Divisble by 2");
		}
	    else if(value%3==0)
	    {
		System.out.println("Divisble by 3");
	    }
	    else {
	    	System.out.println("Not divisible by both");
	    }
		sc.close();
}
}
