package collection;
/*
 1.Write a Java program to create an ArrayList of integers and perform the following operations:
a. Add elements to the ArrayList.
b. Remove an element from a specific index.
c. Update an element at a specific index.
 */

//import the java package-ArrayList 
import java.util.ArrayList;
public class ArrayListHandsOn 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> number=new ArrayList<>();
		
		//Adding the element in the array list
		number.add(25);
		number.add(56);
		number.add(12);
		number.add(36);
		number.add(10);
		
		//Print the array list 
		System.out.println("In arraylist element are: "+number);
		
		//Remove the array using index value
		number.remove(2);
		number.remove(3);
		
		//print the after remove element array list
		System.out.println("Remove the some element new ArrayList is: "+number);
		
		//Add the some element using index value
		number.add(2, 26);
		number.add(3,29);
		//Print the Updated array list
		System.out.println("Updated ArrayList is: "+number);
	}

}
