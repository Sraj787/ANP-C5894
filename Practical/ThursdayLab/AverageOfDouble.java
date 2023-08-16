package thursdaylabs;

/*
 * Question 1: Write a Java program to find the average of all elements in an array of doubles.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class AverageOfDouble 
{
		public static void main(String[] args) 
		{
			//Scanner class object
			Scanner sc =new Scanner(System.in);
			
			//Creating LinkedList of integer
			ArrayList<Double> num = new ArrayList<>();
			
			//Statement for Enter the size of array list 
			System.out.println("Enter the size of the array list: ");
			
			//Store the size of array list
			int size = sc.nextInt();
			
			//statement to enter the element of the array list
			System.out.println("Enter the Elements: ");
			
			//Adding the element in LinkedList
			for(int i=0;i<size;i++) 
			{
				num.add(sc.nextDouble());
			}
			
			//Creating a variable to store sum of all element
			double sum=0;
			//using for loop to add the all element one by one
			for(int i=0;i<num.size();i++) 
			{
				sum = sum + num.get(i);
			}
			//display the sum of all element
			System.out.println("Sum of ArrayList is: "+sum);
			
			//To find the average of the LinkedList
			double average = sum/num.size();
			
			//Print the average  of the LinkedList
			System.out.println("Average of ArrayList is :"+average);
			
			//Scanner class close
			sc.close();
		}

	}
