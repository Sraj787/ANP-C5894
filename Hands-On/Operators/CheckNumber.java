package operators;
/*
 Write a Java program that takes an integer as user input and checks if it is a positive number.
 */
//import the java packages
import java.util.*;
public class CheckNumber {

	public static void main(String[] args) {
		//Scanner class object
		Scanner sc = new Scanner(System.in);
		
		//Statement To Enter A Number 
		System.out.print("Enter the number: ");
		
		//Variable to store the number
		int number = sc.nextInt();
		
		//check the number is positive or not using condition
		boolean isPositive = number>0;
		
		//Print the value
		System.out.println("Number is positive : "+isPositive);

		//Close the scanner class
		sc.close();
	}

}
