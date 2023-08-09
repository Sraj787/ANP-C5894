package collection;
/*
 Question 1: ArrayList Operations
Write a Java program that demonstrates the following operations using an ArrayList:
a) Adding elements to the list.
b) Removing an element from the list.
c) Updating an element in the list.
d) Displaying the contents of the list.
 */

import java.util.ArrayList;
public class OperationArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<>();
		
		//Adding the element in the array list
		number.add(5);
		number.add(8);
		number.add(6);
		number.add(9);
		
		//Print the element of the array list
		System.out.println("In ArrayList Element Are: "+number);
		
		//remove the element from the array list
		number.remove(2);
		number.remove(1);
		
		//print the array list after the removing some element
		System.out.println("After Remove Some Element:"+number);
		
		//Adding new element in array list using index value
		number.add(0, 4);
		number.add(1, 7);
		
		//Print the current array list 
		System.out.println("Current ArrayList Is: "+number);
		

	}

}
