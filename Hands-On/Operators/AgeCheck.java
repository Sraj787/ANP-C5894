package operators;

/*
 Q1.Write a Java program that prompts the user to enter their age.
 The program should check if the age is greater than or equal to 18 and print "You are an adult" if true, 
 or "You are a minor" otherwise.
 */
//import the java packages
import java.util.*;

public class AgeCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		
		if (18<=age) {
			System.out.println("Yor are an adult");
		}
		else {
			System.out.println("You are a minor");	
		}
		sc.close();
	}

}
