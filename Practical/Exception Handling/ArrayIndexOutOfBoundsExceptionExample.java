package ExceptionHandling;

import java.util.Scanner;
public class ArrayIndexOutOfBoundsExceptionExample 
{
    public static void main(String[] args) 
    {
    	//Creating Scanner class object
        Scanner sc = new Scanner(System.in);

        //Print statement
        System.out.print("Enter the size of the array: ");
        //get the input from the user as a size of array
        int size = sc.nextInt();
        //Creating array
        int[] array = new int[size];

        //print statement
        System.out.println("Enter elements for the array:");
        //Get the element input from the user
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + i + ": ");
            array[i] = sc.nextInt();
        }

        //print statement
        System.out.print("Enter an index to retrieve an element: ");
        //get the input from the user as a index value 
        int index = sc.nextInt();

        //try & catch block to exception handling
        try 
        {
            int element = array[index];
            System.out.println("Element at index " + index + ": " + element);
        } catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Error: Array index out of bounds!");
        }
        //Scanner class close
        sc.close();
    }
}
