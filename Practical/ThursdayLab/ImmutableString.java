package thursdaylabs;

/*Question 4:
 * Java Program to prove that strings are immutable in java
 */

//import the java packages 
import java.util.Scanner;

public class ImmutableString
{

	public static void main(String[] args) 
	{
		//Creating object of the Scanner class
		Scanner sc = new Scanner(System.in);
		
		//Print statement to enter the string
		System.out.println("Enter the String: ");
		
		//Get the input from the user
		String word = sc.nextLine();
		
		//combine  the input & new word 
		word.concat("New word");//JVM create another string input new word,but nothing refer to
		
		//Print the result only input string value show
		System.out.println("word refer to: "+word);
		
		//Closing the scanner class
		sc.close();
	}

}
