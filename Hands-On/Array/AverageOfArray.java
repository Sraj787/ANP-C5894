package array;
/*
 * Question 1: Write a Java program to find the average of all elements in an array of doubles.
 */
import java.util.Scanner;
public class AverageOfArray 
{

	public static void main(String[] args) 
	{
		
		//Scanner class object
		Scanner sc = new Scanner(System.in);
		
		//Print statement to enter the size of the array
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		//Print statement to enter the element of the array
		System.out.println("Enter the elements: ");
		double[] array = new double[size];
		
		//Using the for loop to take the input of  elements
		for (int i=0;i<size;i++) 
		{
			array[i]=sc.nextDouble();
		}
		
		//Print statement Array elements are
		System.out.print("Array elements are: ");
		for(int i=0;i<size;i++) 
		{
			//Print all input element
			System.out.print(array[i]+" ");
		}
		
		//new variable declare to store the sum of all element
		double sum=0;
		//Using for loop to calculate the sum of all element
		for(int i=0;i<size;i++) 
		{
			sum =sum+array[i];
		}
		
		//New variable declare
		double average = sum/size;
		System.out.println();//Print the blank space
		//print the Average of the array
		System.out.println("Average of the array: "+average);
		
		//close the scanner class
		sc.close();

	}

}
