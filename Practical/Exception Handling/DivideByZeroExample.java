package ExceptionHandling;

//DivideByZeroException example
import java.util.Scanner;
public class DivideByZeroExample
{
	 public static void main(String[] args) 
	  {
		//Scanner class object
	    Scanner sc = new Scanner(System.in);

	    //statement is Enter the numerator
	    System.out.print("Enter the numerator: ");
	    //get the input from the user
	    int numerator = sc.nextInt();

	    //statement is Enter the denominator
	    System.out.print("Enter the denominator: ");
	    //Get the  input from user 
	    int denominator = sc.nextInt();

	    //Exception Handling using try & catch block
	    //In a try block write the logic throw the exception to catch block
	    try 
	    {
	    	    //Divide the Two number and print the result
	            int result = numerator / denominator;
	            //print the value of the result
	            System.out.println("Result: " + result);
	    }
	    //Catch block handling the exception
	    catch (ArithmeticException e)
	    {
	    	    //Exception message
	            System.out.println("An exception occurred: " + e.getMessage());
	    } 
	    //Scanner class close
	    sc.close();
	    }
	}
