package thursdaylabs;

/*
 * Question 2: Given an array of integers, write a Java program to find the maximum and minimum elements in the array.
 */

//import java package
import java.util.ArrayList;
import java.util.Scanner;
public class MaxMinFind 
{

	public static void main(String[] args) 
	{
		//Scanner class object
		Scanner sc = new Scanner(System.in);
		
		//Statement to enter the size of array
		System.out.println("Enter the size of array list: ");
		
		//Store the value of size
		int size = sc.nextInt();
		
		//Creating array list 
		ArrayList<Integer> number = new ArrayList<>();
		
		System.out.println("Enter the element of the array list: ");
		//Adding the element in array list
		for(int i=0;i<size;i++) 
		{
			number.add(sc.nextInt());
		}
		//Print the array list
		System.out.println("ArrayList element is: "+number);
		
		//Finding the maximum element in array list
		//Initialized the new variable with array index value 0
		int max=number.get(0);
		//Using for loop to check all element in array list 
		for(int i=0;i<number.size();i++) 
		{
			//using If condition to check the ith index value is grater then or not max index value
			if(number.get(i)>max) 
			{
				max = number.get(i);
			}
		}
		//Print the maximum value of the array list
		System.out.println("Maximum element in arraylist is: "+max);
		
		//Finding the minimum element in array list
		//Initialized the new variable with array index value 0
		int min=number.get(0);
		//Using for loop to check all element in array list 
		for(int i=0;i<number.size();i++) 
		{
			//using If condition to check the ith index value is less then or not min index value
			if(number.get(i)<min) 
			{
				min = number.get(i);
			}
		}
		//Print the minimum value of the array list
		System.out.println("Manimum element in arraylist is: "+min);
		
		//Closing Scanner class
		sc.close();
	}
}

