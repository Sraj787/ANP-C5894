package loops;
/*
  Write a Java program that takes an integer as
  input and checks if it is divisible by 5 and 11. 
  Print "Divisible" if it is divisible by both, and "Not Divisible" otherwise.
 */
import java.util.*;
public class IfElseE1 {

	public static void main(String[] args) {
		//Scanner class to take input from the user
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number:");
		//input from the user 
		int num = sc.nextInt();
		
        //Conditions
    if (0<num) 
    {
			System.out.println("Number is Positive");
			
	}
	else if(num<0)
	{
		System.out.println("Number is Negative");
	}
	else {
		System.out.println("Number is 0");
	}
    //Scanner class Closing
    sc.close();
}
}