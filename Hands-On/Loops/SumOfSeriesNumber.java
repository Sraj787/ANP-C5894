package loops;
/*
 Write a Java program that asks the user to enter a series of numbers (positive or negative) and calculates their sum. 
 The program should stop asking for input when the user enters 0.
 Use a do-while loop to continuously ask for numbers and keep adding them to the sum.
 */

//Import java package
import java.util.*;

public class SumOfSeriesNumber 
{

	public static void main(String[] args) 
	{
	  //Scanner class object	
      Scanner sc = new Scanner(System.in);
    //Declaring variable
      int number;
      int sum =0;
      
    //Do-while loop use  
      do {
    	  System.out.println("Enter the Number:");
    	  number = sc.nextInt();
    	  sum +=number;
    	  }
      //Test Expression
      while(number!=0);
      
   
      //Print the sum of number
      System.out.println("Sum of Number is:"+sum);
      
      //close Scanner class
      sc.close();
	}

}
