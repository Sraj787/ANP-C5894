package ExceptionHandling;
/*
Hands-on:Develop a program that takes a user's age as input and determines if they are eligible to vote (age >= 18).
If the user enters non-numeric text or a negative number, catch the NumberFormatException and IllegalArgumentException respectively,
displaying appropriate error messages.
 */
import java.util.Scanner;
public class EligibleAgeForVote 
{

	public static void main(String[] args) 
	{
		//Creating Scanner class object
		Scanner sc = new Scanner(System.in);
		
		//Print the statement
        System.out.print("Enter Your age: ");
        //Get the input from the user using parseInt()
        int age = Integer.parseInt(sc.nextLine());
        
		//Try block identify the exception		
		try {
            //To check number is greater than 0 if less than 0 throw exception
            if(age<=0) 
            {
            	//Throw the new Exception to the catch block
            	throw new IllegalArgumentException("Invalid Age! Please Enter valid age");
            }
            //Using if else condition
            //If age is greater than 18 to execute this code
			if (age>=18) 
			{
				//Print the statement as a Result
				System.out.println("You are eligible for vote.");
			}
			//If age is less than 18 to execute this code
			else 
			{
				//Print the statement as a Result
				System.out.println("You are not eligible for vote.");
			}
		}
	    //Catch the exception
		//To handle the non-numeric exception
		catch(NumberFormatException e) 
		{
			//Print the statement after getting exception
            System.out.println("Invalid input. Please enter a number.");
		}
		//To handle the negative value Exception
		catch(IllegalArgumentException e)
		{
			//Print the statement after getting exception
			System.out.println("An exception occurred: "+e.getMessage());
		}
		//Scanner class close
		sc.close();

	}

}
