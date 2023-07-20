

package loops;

/*
 *to prompt the user enter the limit of number and to check the condition or use the continue or break statement
 *print the output
 */

import java.util.Scanner;

public class BreakContinueEx
{
   public static void main(String[] args) 
   {
   	//input from the user
       Scanner sc = new Scanner(System.in);

       // Get the number of iterations from the user
       System.out.print("Enter the limit of number: ");
       int limit = sc.nextInt();

       // Perform a loop for the given number of iterations
       for (int i = 1; i <= limit; i++) 
       {
           // Check if the current iteration is divisible by 3
           if (i % 3 == 0) 
           {
               // Skip this iteration and continue to the next one
               continue;
           }
           
        // Print the current number
           System.out.print(i + " ");

           // Check if the current number is greater than or equal to 10
           if (i >= 10) 
           {
               // Break the loop if the condition is true
               break;
           }
       }

       sc.close();
   }
}

