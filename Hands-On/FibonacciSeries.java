package loops;
/*
 * Exercise :
Write a program that prints the Fibonacci series up to a specified limit entered by the user.
However, skip printing numbers that are divisible by 3.
Use the continue statement to skip such numbers.
 */
//import java packages
import java.util.*;

public class FibonacciSeries {

	public static void main(String[] args) {
		//scanner class object 
	      Scanner sc =new Scanner(System.in);
	      System.out.print("Enter the limit: ");
	      //Declaring the variable 
	      int a=0;
	      int b=1;
	      int c=0;
	      
	    //get imput fro the user
	      int limit = sc.nextInt();
	      System.out.print("Fibonacci Series is: ");
	      
	      //Using for loop to print limit of fibonacci series 
	      for(int i=2;i<=limit;++i) {
	    	  c =a + b;	    	  
	    	  a=b;
	    	  b=c;
	    	  
	    	  //check condition divisible by 3 or not.If divisible by 3 then skip the value
	    	  if(c%3==0) {
	    		  continue;
	    	  }
	    	  //print the output 
	    	  System.out.print(" "+c);
	    	  }
	     
	      //close scanner class
          sc.close();
	}

}
