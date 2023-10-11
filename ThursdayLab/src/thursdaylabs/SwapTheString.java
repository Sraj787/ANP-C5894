package thursdaylabs;
/*
 * How to swap two String variables without third variable
 */
import java.util.Scanner;

public class SwapTheString 
{

	public static void main(String[] args) 
	{
		
		//Creating Scanner class object
		Scanner sc = new Scanner(System.in);
		//Print statement to enter the second string
		System.out.println("Enter the first String  : ");
		//Get the input String from the user 
		String s1 = sc.nextLine();
		
		//Print statement to enter the second string
		System.out.println("Enter the second String : ");
		//Get the input String from the user 
		String s2 = sc.nextLine();
		//Print the before swap value
		System.out.println("String1 : "+s1);
		System.out.println("String2 : "+s2);
		
		int length1 = s1.length();
		//Adding the both string 
		s1 = s1 + s2;
		//to store the value of s2 for index 0 to s1 String last index
		s2 = s1.substring(0, length1);
		//to store the remaining value in s1
		s1 = s1.substring(length1);
		
		//Print the result
		System.out.println("After swapping:");
		System.out.println("String1 : "+s1);
		System.out.println("String2 : "+s2);
		
		//Close the scanner class
		sc.close();

	}

}
