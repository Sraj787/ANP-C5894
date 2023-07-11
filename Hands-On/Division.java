package loops;
/*
 Write a Java program that takes an integer as input and checks 
 if it is divisible by 5 and 11. Print "Divisible" if it is divisible by both, and "Not Divisible" otherwise.
 */
import java.util.*;
public class Division {

	public static void main(String[] args) {
	//Scanner class to take the input from the user	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value:");
	//Integer input from the user
	int num = sc.nextInt();
	
	//Conditions
	if(num%5==0 || num%11==0) {
		System.out.println("Divisible");
	}else
	{
		System.out.println("not divisible");
	}
	//Scanner closing
    sc.close();
	}

}
