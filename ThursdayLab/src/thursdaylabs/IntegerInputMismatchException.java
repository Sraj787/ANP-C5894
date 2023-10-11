package thursdaylabs;
/*
 lab 3:Write a Java program that reads an integer from the user using the Scanner class.
 Handle the InputMismatchException that can occur if the user enters a non-integer value. 
 Display an appropriate error message.
 */
//import the java packages 
import java.util.Scanner;
import java.util.InputMismatchException;
public class IntegerInputMismatchException {

	public static void main(String[] args) {
		//Creating Scanner class object
		Scanner sc = new Scanner(System.in);
		//In try block write the logical code
		try {
			//Print statement Enter a integer number 
			System.out.println("Enter a Integer value: ");
			//Store the number take from the user
			int number = sc.nextInt();
			//Print the result  
			System.out.println("Integer number is: "+number);
		}
		//Catch block handle the exception
		catch(InputMismatchException e) {
			//Print the exception if input mismatch exception is occurred
			System.out.println("Excepction is occurred:"+"Enter the valid input");
		}
		//Closing the scanner class
		sc.close();

	}

}
