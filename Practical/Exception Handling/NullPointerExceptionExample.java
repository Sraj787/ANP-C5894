package ExceptionHandling;

import java.util.Scanner;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
    	//Creating Scanner class object
        Scanner scanner = new Scanner(System.in);

        //Print statement 
        System.out.print("Enter a string (or 'null' to trigger the exception): ");
        //Take the input from the user 
        String input = scanner.nextLine();

        //Exception handling using try & catch block
        try {
        	//Store the length of the String
            int length = input.length();
            //print the value of the length
            System.out.println("Length of the input string: " + length);
        }
        //Get the exception from the try block
        catch (NullPointerException e) {
        	//Print the statement
            System.out.println("An exception occurred: " + e.getMessage());
        } 
        //Scanner class close
        scanner.close();
    }
}