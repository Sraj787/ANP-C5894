package loops;
/*
 * Exercise 1:
Write a program that prompts the user to enter a series of integers. 
The program should calculate the sum of all the even numbers entered, skipping any negative numbers.
Use the continue statement to skip negative numbers.
 */

//import java package 
import java.util.*;
public class SumOfEven {

	public static void main(String[] args) {
		//Get input from user
		Scanner sc = new Scanner(System.in);
		
		//variable define
		int number;
		int sum=0;
		
		 do { 			 
	    	  System.out.println("Enter the Number:");
	    	  number = sc.nextInt();
	    	  //Using condition to check number is negative than skip the number
	    	  if(number<0) {
	    		  continue;	  
	    	  }
	    	  //using condition finding the even number
	    	  if(number%2==0) {
	    		//sum the all even number
		    	  sum+=number;
	  		  }
	    	  
	    }
	      //Test Expression to check if user enter 0 than exit the while loop
	      while(number!=0);
	    		
		//show the sum of all even number
        System.out.println("Sum of all even number is: "+sum);
        //close the scanner class
        sc.close();
	}

}
