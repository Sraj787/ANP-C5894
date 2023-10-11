package thursdaylabs;

/*
Write a Java program that calculates the sum of all prime numbers up to a given limit using multiple threads.
 */

//import the packages
import java.util.Scanner;

//Creating PrimeThread class
class PrimeThread extends Thread
{
	//Creating run method
	public void run() 
	{
		//Creating Scanner class object
		Scanner sc = new Scanner(System.in);
		//Print statement
		System.out.println("Enter the Limit of the number: ");
		//Get input from the user
		int number = sc.nextInt();
		//declaring variable or initialize
		 int i =0;
		 int num=0;
		 int sum=0;
		 String pnum="";
		 
	     //using for loop
		 for (i = 1; i <= number; i++)         
	       { 		  	  
	          int counter=0; 
	          //again using for loop
	          for(num=i; num>=1; num--)
		  {
	        	 //if  i divisible by 2 and reminder is equal to 0 
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
	      //if counter == 2 this function is run    
		  if (counter ==2)
		  {
			  //calculating the sum of all prime number
		     sum = sum + i ;
		     //to identify the prime number
		     pnum = pnum + i +" ";
		  }
	      }	
		 
		   //print statement 
	       System.out.println("Prime numbers from 1 to "+number+":");
	       //Print the prime number from 0 to number
	       System.out.println(pnum);
	       
	       //Print the Sum of all prime number
	       System.out.println("Sum of the all prime number is : "+sum);
	       sc.close();
	}
}
//ThreadSumOfPrime is main class
public class ThreadSumOfPrime 
{

	public static void main(String[] args) 
	{
		
		//Creating object of the PrimeThread
		PrimeThread num = new PrimeThread();
		//Calling the run method using start method
		num.start();

	}

}
