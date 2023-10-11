package thursdaylabs;
/*
 1.Write a Java program that takes an integer input from the user and 
 checks if it is even or odd using bitwise operators. 
 Print "Even" if the number is even, and "Odd" if the number is odd.
 */
//Java program to check number is even or odd using bitwise operators

//import the java packages
import java.util.*;
public class CheckNumber 
{

	public static void main(String[] args) 
	{
		
		//Scanner class object
		Scanner sc = new Scanner(System.in);
		
		//Print the statement to Enter the integer number
		System.out.print("Enter the integer number: ");
		
		//store the input number in this variable 
		int number = sc.nextInt();
		
		//Apply Bitwise AND operation with input number & 1 
		//store the value in this variable after operation done
	      int isEven = number & 1;
	      
	    //print statement to show the isEven value  
	      System.out.println("Last bit number is: "+ isEven);
	      
	    //if last bit number is 0 the input number is even and if last bit number is 1 input number is Odd  
	      //0 the input number is even  
	      if(isEven!=1) {
	    	  //print the statement 
	    	  System.out.println("Number "+number+ " is Even");
	      }
	      // 1 input number is Odd
	      else
	      {
	    	  ////print the statement 
	    	  System.out.println("Number "+number+" is Odd");
	      }
	    	  		
		//close the scanner class
		sc.close();

	}

}
