package thursdaylabs;

//Question 1:

/*
 Write a Java program that prompts the user to enter a positive integer
 and calculates its factorial using a while loop. The program should display the factorial as the output.
 */

//Import the package
import java.util.*;
public class CalculateFactorial 
{
	public static void main(String[] args) 
   {
		
	//Scanner class object to take input from the user		
    Scanner sc= new Scanner(System.in);
     
    //Print the statement to get the number through the user
	System.out.print("Enter the number to calculate its factorial: "); 
	     
	 //initialized factorial is 1 
	   int factorial = 1;
	 //initialized i is 1  
	   int i=1;
	   
	 //integer input  
	   int num =sc.nextInt();
	   
   //Using If for check the input number is greater than 0       
   if(num<0) {
	 System.out.println("Invalid input.Please enter a Positive number");
        }
   
   //while loop condition to check input number is positive or not
   while(num<0) {
	   
        }
   
    //while loop condition to check i is less than or equal to the input number  
    while(i<=num) {	
    factorial *=i;
    //increment i by 1 
    i++;
        }
    
    //Print the factorial of the Given Number    
    System.out.println("Factorial of "+num+" is: "+ factorial);
         
    //Closing Scanner Class
    sc.close();
   }
 }

