package loops;

/*The continue statement in Java is used to skip the remaining code
within a loop iteration and proceed to the next iteration.
It is primarily used to control the flow of a loop and 
selectively skip certain iterations based on a condition.
*/

/*
Ques.Write a the program that asks the user for the number of iterations 
they want to perform. It then uses a for loop to iterate from 1 
to the specified number of iterations.
*/

import java.util.Scanner;

public class ContinueExample
{
   public static void main(String[] args) 
   {
   	//input from the user
       Scanner sc = new Scanner(System.in);

       // Get the number of iterations from the user
       System.out.print("Enter the number of iterations: ");
       int iterations = sc.nextInt();

       // Perform a loop for the given number of iterations
       for (int i = 1; i <= iterations; i++) 
       {
           // Check if the current iteration is divisible by 3
           if (i % 3 == 0) 
           {
               // Skip this iteration and continue to the next one
               continue;
           }
           
           // Print the current iteration number
           System.out.println("Iteration: " + i);
       }

       sc.close();
   }
}
