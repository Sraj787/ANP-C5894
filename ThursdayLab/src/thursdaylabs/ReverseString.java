package thursdaylabs;

/*Question 3:
 * Write a java program to reverse each word in string?
 */

//import the java packages
import java.util.Scanner;

public class ReverseString 
{

	public static void main(String[] args) 
	{
		
		//Creating object of the Scanner class
		Scanner sc = new Scanner(System.in);
		
		//Print statement to enter the string
		System.out.print("Enter the String: ");
		
		//Get the input from the user
		String input = sc.nextLine();
		
		//Call the reversedString1 store the value in variable reverse
		String reverse = reversedString1(input);
		
		//Print the result
		System.out.println("Reversed String: " + reverse);
		
		//Close the Scanner class
		sc.close();

	}
	//Creating ReversedString method
	public static String reversedString1(String input) 
	{
		
		//Creating object of the StringBuffer or use the reverse method
		StringBuffer reversed = new  StringBuffer(input).reverse();
		//return the value to reversed
		return reversed.toString();
	}

}
