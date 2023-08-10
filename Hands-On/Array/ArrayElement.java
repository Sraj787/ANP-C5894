package array;

/*
 * Question 2: Given an array of integers, write a Java program to find the maximum and minimum elements in the array.
*/
import java.util.Scanner;
public class ArrayElement 
{

	public static void main(String[] args) 
	{
		//Creating Scanner class object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of array:");
		
		//store the value 
		int size = sc.nextInt();
		
		//Print statement to enter the arrays elements
		System.out.println("Enter the elements:");
		
		//Creating a array
		int[] array = new int[size];
		
		//using for loop to take input element of the array
		for(int i=0;i<size;i++) 
		{
			array[i]=sc.nextInt();
		}
		//Print statement 
		System.out.print("Array element is: ");
		for(int i=0;i<size;i++) 
		{
			//Print the array element
			System.out.print(array[i]+" ");
		}
		
		//In a array find the maximum element value
		//Creating new variable to store the max value of the array 
		int max=array[0];
		//Using the for to check the all element
		for(int i=0;i<size;i++) 
		{
			//Using the if condition max value is greater then array[i] value
			if (array[i]>max) 
			{
				max = array[i];
			}
		}
		//Print the blank space
		System.out.println();
		//print the maximum value of the array
		System.out.println("In a array maximum element is: "+max);
		
		//In a array find the minimum value element
		int min=array[0];
		for(int i=0;i<size;i++) 
		{
			//Using the if condition min value is less then array[i] value
			if (array[i]<min) 
			{
				min = array[i];
			}
		}
		//Print the minimum value of array
		System.out.println("In a array maximum element is: "+min);
		
	//Close the Scanner class	
	sc.close();	
	}

}
