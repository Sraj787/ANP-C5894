package operators;

/*
 * 2.Write a Java program that prompts the user to enter a three-digit number. 
 * The program should check if the number is a palindrome, which means it reads the same forwards and backwards.
 */
//import java packages
import java.util.*;
public class PalindromeCheck{
	
	public static void main(String[] args) {
		//Scanner class object
		Scanner sc = new Scanner(System.in);
		
		//Print the statement to Enter three digit number
		System.out.println("Enter three digit number: ");
		
		//Defining the variables
		 int temp;
		int sum=0;
		int rimiander;
		
		//Get input from the user
		int number = sc.nextInt();
		
		//Temporary variable is equal to input number
		 temp = number;
		//Number will be greater than 0
		while(number>0) {
			rimiander = number%10;
			sum = sum * 10 + rimiander;
			number= number/10;
		}
		//compare the both numbers temporary or input number 
		if(temp==sum) {
			//if both number are same than print this statement
			System.out.println("The number is a palindrome");
		}
		else {
			//if both number are not same than print this statement
			System.out.println("The number is not a palindrome");
		}
		//close the Scanner class
		sc.close();
	}

}
