package collection;
/*
 1.Create a method to find the sum of all the elements in an ArrayList of integers. 
 Test your method with a sample ArrayList
 */

import java.util.ArrayList;
public class SumOfList {

	public static void main(String[] args) {
	
		//Creating List of integer
		ArrayList<Integer> num= new ArrayList<>();
		
		//Adding the integer element
		num.add(25);
		num.add(36);
		num.add(21);
		num.add(12);
		
		//print the array element value 
		System.out.println("Array List: "+ num);
		
		//Using the for loop to add the all element one by one
		int sum =0;
		for(int i=0;i<num.size();i++) {
			sum = sum + num.get(i);
		}
		
		//Print the sum of all element
		System.out.println("Sum of ArrayList is: "+sum);
		
	}

}
