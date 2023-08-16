package thursdaylabs;

/*
 Exercise 2: Array Average
Write a program that takes the size of the array as input from the user.
Then, prompt the user to enter elements of the array.
Calculate and display the average of all elements in the array.
 */

//import the Java packages 
import java.util.*;
public class AverageOfarray {

	public static void main(String[] args) {
		
			  	//Scanner class object
				Scanner sc = new Scanner(System.in);
				
				//Display the statement to enter the size of array
				System.out.print("Enter a Size Of Array: ");
				
				//store the integer value get from the user
				int size = sc.nextInt();
				
				//Creating the one-dimensional array 
				int[] numbers = new int[size];
				
				//Enter the integer number print the statement 
				System.out.println("Enter The integers number: ");
				
				//store each element in there size using the for loop
				//For loop following the condition i is less than array size 
				for(int i=0;i<size;i++) 
				{
					//store the element
					numbers[i] = sc.nextInt();		
				}
				
				//new variable define is sum.
		        int sum=0;//store the sum of all element
		        
		        //New variable define
		        float average=0;//Storing the average of all element
		        
		        //For loop using to calculate the sum of all element
		        //To check the condition i is less than array size 
		        for(int i=0;i<size;i++) 
		        {
		        	//Sum the each element one by one
		        	sum = sum + numbers[i];	
		        }
		        
		        //Calculating the average of all element 
		        average = (float)sum/size;//to store the average in float data type
		        
		        //To display the average of all elements
		        System.out.println("Average Of the All element is: "+average);
				
		        //Close the Scanner class
				sc.close();

	}

}
