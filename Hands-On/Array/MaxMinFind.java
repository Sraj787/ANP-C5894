package array;

/*
 * Question 2: Given an array of integers, write a Java program to find the maximum and minimum elements in the array.
 */

//import java package

import java.util.Scanner;
public class MaxMinFind 
{

	public static void main(String[] args) 
	{
		//Scanner class object
		Scanner sc = new Scanner(System.in);
		
		//Statement to enter the size of array
		System.out.println("Enter the size of array : ");
		
		//Store the value of size
		int size = sc.nextInt();
		
		//Creating array  
		int[] array = new int[size];
		
		System.out.println("Enter the element of the array : ");
		//Adding the element in array 
		for(int i=0;i<size;i++) 
		{
			array[i]=sc.nextInt();
		}
		
		//Finding the maximum element in array 
		//Initialized the new variable with array index value 0
		int max=array[0];
		//Using for loop to check all element in array  
		for(int i=0;i<array.length;i++) 
		{
			//using If condition to check the ith index value is grater then or not max index value
			if(array[i]>max) 
			{
				max = array[i];
			}
		}
		//Print the maximum value of the array 
		System.out.println("Maximum element in arraylist is: "+max);
		
		//Finding the minimum element in array 
		//Initialized the new variable with array index value 0
		int min=array[0];
		//Using for loop to check all element in array  
		for(int i=0;i<array.length;i++) 
		{
			//using If condition to check the ith index value is less then or not min index value
			if(array[i]<min) 
			{
				min = array[i];
			}
		}
		//Print the minimum value of the array 
		System.out.println("Manimum element in arraylist is: "+min);
		
		//Closing Scanner class
		sc.close();
	}
}


