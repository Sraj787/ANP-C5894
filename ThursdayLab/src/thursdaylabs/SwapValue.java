package thursdaylabs;
/*
 2.Write a Java program that takes two integer inputs from the user and swaps their values using bitwise operators.
  After swapping, print the updated values of the two integers. 
 */

//java program to swap the two interger input using bitwise operator (XOR)
//import java packages
import java.util.*;
public class SwapValue 
{

	public static void main(String[] args) 
	{
		
		//Scanner class object
		Scanner sc = new Scanner(System.in);
		
		//print statement to Enter the 1st integer number
		System.out.print("Enter the 1st number: ");
		//store the 1st input value in this variable 
		int num1 = sc.nextInt();
		
		//print statement to Enter the 2nd integer number
		System.out.print("Enter the 2nd Number: ");
		//store the 2nd input value in this variable
		int num2 = sc.nextInt();
		
		//New value store in first number or apply the XOR between 1st input number or 2nd input number
		num1 = num1^num2;
		
		//New value store in second number or apply the XOR between  new 1st input number or 2nd input number
		//swap value store in updated 2nd number
		num2 = num1^num2;
		
		//New value store in first number or apply the XOR between new 1st input number or  new 2nd input number
		//swap value store in updated 1st number
		num1 = num1^num2;
		
		//print the statement 
		System.out.println("Updated Value is:");
		//print the 1st swap or updated value
		System.out.println(" 1st number is: "+num1);
		//print the 2nd swap or updated value
		System.out.println(" 2nd number is: "+num2);
		
		//close the scanner class
		sc.close();

	}

}
