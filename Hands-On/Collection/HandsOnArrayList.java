package collection;
/*
 1.Write a Java program to create an ArrayList of integers and perform the following operations:
a. Add elements to the ArrayList.
b. Remove an element from a specific index.
c. Update an element at a specific index.
 */

//import the java package-ArrayList 
import java.util.ArrayList;
import java.util.Scanner;
public class HandsOnArrayList 
{

	public static void main(String[] args) 
	{
		//Scanner class object
		Scanner sc = new Scanner(System.in);
		//ArrayList object
		ArrayList<Integer> number=new ArrayList<>();
		
		//Print statement to Enter the array list size
		System.out.println("Enter the Size of arraylist");
		//store the array list size value
		int size = sc.nextInt();
		
		//Print statement to enter the element in array list 
		System.out.println("Enter the element in Arraylist");
		//using the for loop to take the input element from the user
		for(int i=0;i<size;i++) 
		{
			number.add(sc.nextInt());
		}
		//print the array list
		System.out.println("ArrayList is: "+number);
		
		//Please enter the how many value you want to remove 
		System.out.println("Enter the how element want to remove:");
		//store remove value from the user
		int remove = sc.nextInt();
		
		//using if condition to check the remove value is less than array list size
		if(remove<size) {
		//using the for loop to remove the element from the array list using index value	
		for(int i=0;i<remove;i++) 
		{
			//Remove the element
			number.remove(sc.nextInt());
		}
		//After removing print the array list
		System.out.println("After Remove :"+number);
		}
		//if remove value is greater than the size 
		else {
			//print this statement
			System.out.println("Invaid! Input.Please enter remove value is less than Arraylist size.");
		}
		
		//Print statement to enter the how many value you want to update
		System.out.println("Enter the How many value you want to update: ");
		//Store update input value
		int update = sc.nextInt();
		
		System.out.println("First Enter the index number or than element value:");
		//Using for loop to update the element value using index number
		for(int i=1;i<=update;i++) 
		{
			number.add(sc.nextInt(), sc.nextInt());
			System.out.println("Update "+i+":");
		}
		//Print the array list after updating
		System.out.println("Updated Arraylist is: "+number);
		
		//close the scanner class
		sc.close();
	}

}
