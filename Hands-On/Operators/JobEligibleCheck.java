package operators;
/*
 * 1.Write a Java program that prompts the user to enter their age.
 The program should check if the age is between 18 and 30 (inclusive) and print "Eligible for Job" if true,
 or "Not Eligible for Job" otherwise
 */
//import a java packages for scanner class
import java.util.*;
public class JobEligibleCheck {

	public static void main(String[] args) {
        //Scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		//take age input from the user
		int age =sc.nextInt();
		
		//to check condition age is greater than 18 or less than 30. 
		if(18<age && age<30) {
			//if condition is satisfied then print these statement
			System.out.println("Eligible for job");
		}
		else {
			//if condition  is not satisfied then print these statement
			System.out.println("Not Eligible for job");
		}

		//close the scanner class
		sc.close();
	}

}
