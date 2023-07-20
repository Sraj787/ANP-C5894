package operators;

/*Program where user is prompted to enter two numbers, 
which are stored in the variables num1 and num2.
Then, we perform various arithmetic operations on these numbers, 
such as addition, subtraction, multiplication, division, and modulus.
*/

import java.util.Scanner;

public class ArithmeticOperatorExample 
{
    public static void main(String[] args)
    {
    	//input from the user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        //input for the 1st number
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        //input for the 2nd number
        int num2 = sc.nextInt();

        //operations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        //print the operation values
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        sc.close();
    }
}
