package thursdaylabs;
/*
 lab 4:Write  a Java program that reads a string input from the user. 
 Convert the string to an integer using the Integer.parseInt() method.
 Handle the NumberFormatException that can occur if the input cannot be parsed as an integer.
 Display a message indicating that the input is not a valid integer.
 */
//import the java packages
import java.util.*;
public class ConvertStringToInt {

	public static void main(String[] args) {
		//Creating Scanner class object
		Scanner sc = new Scanner(System.in);
		
		//Print Statement Enter the String Input
		System.out.println("Enter the String input: ");
		//Store the String value
		String word = sc.nextLine();
		//In try block write the logical code or try block throw the exception to the catch block 
		try {
		//Using Integer parseInt method 	
		Integer.parseInt(word);
		//Print the result
		System.out.println("Number is a integer: "+word);
		}
		//catch block to handle the exception
		catch(NumberFormatException e) {
			//Print the exception if occurred
			System.out.println("Exception is occurred: "+"Is not a valid integer");
		}
		//Scanner class close
		sc.close();

	}

}
