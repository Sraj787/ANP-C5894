package operators;

/*
Create a program to use the Scanner class to read user input from the console. 
The user is prompted to enter two numbers, which are stored in the variables
num1 and num2.
We then use various comparison operators (==, !=, >, <, >=, <=) 
to compare these two numbers and store the results in boolean variables
(isEqual, isNotEqual, isGreater, isLess, isGreaterOrEqual, isLessOrEqual).
 */
import java.util.Scanner;

public class ComparisonOperatorsExample 
{
    public static void main(String[] args)
    {
    	//input from the user
        Scanner sc = new Scanner(System.in);

        //input for 1st number
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        //input for 2nd number
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Comparison operators 
        boolean isEqual = num1 == num2;
        boolean isNotEqual = num1 != num2;
        boolean isGreater = num1 > num2;
        boolean isLess = num1 < num2;
        boolean isGreaterOrEqual = num1 >= num2;
        boolean isLessOrEqual = num1 <= num2;

        //print statements
        System.out.println("Is num1 equal to num2? " + isEqual);
        System.out.println("Is num1 not equal to num2? " + isNotEqual);
        System.out.println("Is num1 greater than num2? " + isGreater);
        System.out.println("Is num1 less than num2? " + isLess);
        System.out.println("Is num1 greater than or equal to num2? " + isGreaterOrEqual);
        System.out.println("Is num1 less than or equal to num2? " + isLessOrEqual);
        sc.close();
    }
}