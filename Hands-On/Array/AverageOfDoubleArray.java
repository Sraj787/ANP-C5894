package array;
/*
 * Question 1: Write a Java program to find the average of all elements in an array of doubles.
 */
import java.util.Scanner;
public class AverageOfDoubleArray 
{
	public static void main(String[] args) 
	{
	
					//Scanner class object
					Scanner sc = new Scanner(System.in);
					
					//Statement for Enter the size of array  
					System.out.println("Enter the size of the array : ");
					
					//Store the size of array 
					int size = sc.nextInt();
					
					//Creating a array
					double[] array = new double[size];
					
					//statement to enter the element of the array 
					System.out.println("Enter the Elements: ");
					
					//Adding the element in LinkedList
					for(int i=0;i<size;i++) 
					{
						array[i]=sc.nextDouble();
					}
					
					//Creating a variable to store sum of all element
					double sum=0;
					//using for loop to add the all element one by one
					for(int i=0;i<array.length;i++) 
					{
						sum = sum + array[i];
					}
					//display the sum of all element
					System.out.println("Sum of ArrayList is: "+sum);
					
					//To find the average of the LinkedList
					double average = sum/size;
					
					//Print the average  of the LinkedList
					System.out.println("Average of ArrayList is :"+average);
					
					//Scanner class close
					sc.close();
				}
	
}
