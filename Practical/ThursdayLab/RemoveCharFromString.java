package thursdaylabs;

/*Question 2:
 * How to remove a particular character from a String
 */

//import java packages
import java.util.*;
public class RemoveCharFromString 
{

	public static void main(String[] args) 
	{
		
		//Creating object of the Scanner class
		Scanner sc = new Scanner(System.in);
		
		//Print statement to enter the string
		System.out.println("Enter the String :");

		//Get the input from the user
		String input = sc.nextLine();
		
		//Print statement to Enter the remove character
		System.out.println("Enter the remove character: ");
		
		//Get the input from the user to remove the character
		String remove = input.replace(sc.next(), "");
		
		//Print statement After removing character String is
		System.out.println("After removing character String is :");
		
		//Print the result
		System.out.println(remove);
		
		//Close the scanner class
		sc.close();
	}
}

