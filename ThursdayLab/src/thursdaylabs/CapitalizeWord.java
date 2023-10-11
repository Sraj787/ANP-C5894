package thursdaylabs;

/*Question 1:
 * Java Program to capitalize each word in String
 */

//import the java package
import java.util.Scanner;

public class CapitalizeWord 
{

	public static void main(String[] args) 
	{
		
		//Creating the scanner class object
		Scanner sc = new Scanner(System.in);
		
		//Print statement Enter the word 
		System.out.println("Enter the word:");
		//Get the input from the user
		String word = sc.nextLine();
		
		//if condition to check input  
		if(word != "")
		{
			//Using touppercase method  to capitalize the word
			word = word.toUpperCase();
			//print the result
			System.out.println(word);
		}else 
		{
			//print statement
			System.out.println("!Please enter the valid input." );
		}
		
		//Scanner class Close
		sc.close();

	}

}
