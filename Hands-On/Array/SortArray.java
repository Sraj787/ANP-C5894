package array;
/*
 Write a Java program to take an 15  array of integers as input from the user and 
 sort it in ascending order using any suitable sorting algorithm.
 Display the sorted array.
 */
import java.util.*;
public class SortArray {

	public static void main(String[] args) 
	{
	    //Scanner class Object
		Scanner sc = new Scanner(System.in);
		
		//Size of Array
		int size = 15;
		
		//Statement to enter 15 element
		System.out.println("Enter "+ size +" Elements: ");
		
		//Get element array for the user input
		int[] arr = new int[size];
		for(int i=0;i<size;i++) 
		{
			arr[i] = sc.nextInt();
		}
		
		//Sorting the array 
		Arrays.sort(arr);
		System.out.println("Array in asending order: ");
		printArray(arr);
		
		sc.close();

	}
	 private static void printArray(int[] arr) 
	{
	      for (int i = 0; i < arr.length; i++) 
	      {
	          System.out.print(arr[i] + " ");
	      }
	      System.out.println();
	}
}
