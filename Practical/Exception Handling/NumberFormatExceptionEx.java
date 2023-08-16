package ExceptionHandling;

/*
 *In this example, the program prompts the user to enter a number. 
 *It then attempts to parse the user's input into an integer using Integer.
 *parseInt(). If the user enters non-numeric text, the NumberFormatException
 *unchecked exception can occur.
 *The try block contains the input and parsing operations.
 *If a NumberFormatException occurs, the catch block catches 
 *the exception and informs the user about the invalid input.
 */
import java.util.Scanner;

public class NumberFormatExceptionEx
{
    public static void main(String[] args)
    {
    	//Creating Scanner class object
        Scanner scanner = new Scanner(System.in);
        
        //Using try and catch method to handle the exception
        try 
        {
        	//Print the statement
            System.out.print("Enter a number: ");
            //Get the input from the user using parseInt()
            int number = Integer.parseInt(scanner.nextLine()); // This line can throw NumberFormatException
            //Print the output
            System.out.println("You entered: " + number);
        } 
        //catch block catch the exception from try block
        catch (NumberFormatException e)
        {
        	//Print the statement after getting exception
            System.out.println("Invalid input. Please enter a valid number.");
        }   
        //Scanner class close
        scanner.close();     
        //Print statement 
        System.out.println("Program continues...");
    }
}
