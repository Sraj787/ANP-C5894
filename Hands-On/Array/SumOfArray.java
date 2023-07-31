package thursdaylabs;

/*Lab Exercise 1: Array Sum
Write a program that takes the size of the array as input from the user.
Then, prompt the user to enter elements of the array. 
Calculate and display the sum of all elements in the array.
*/

//import the Java packages 
import java.util.*;
public class SumOfArray {

	public static void main(String[] args) 
	{
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
		
		//For storing the sum of all element to create new variable is sum.
        int sum=0;
        
        //For loop using to calculate the sum of all element
        //To check the condition i is less than array size 
        for(int i=0;i<size;i++) 
        {
        	sum = sum + numbers[i];	
        }
        
        //To display the sum of all elements
        System.out.println("Sum Of the All element is: "+sum);
		
        //Close the Scanner class
		sc.close();

	}

}
