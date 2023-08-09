package collection;
/*
 3.Create a method to find the average of all the elements in a LinkedList of integers. Test your method with a sample LinkedList.
 */

import java.util.LinkedList;
public class AverageOfLinkList {

	public static void main(String[] args) {
		//Creating LinkedList of integer
		LinkedList<Integer> num = new LinkedList<>();
		
		//Adding the element in LinkedList
		num.add(25);
		num.add(45);
		num.add(36);
		num.add(23);
		num.add(63);
		
		//Creating a variable to store sum of all element
		int sum=0;
		//using for loop to add the all element one by one
		for(int i=0;i<num.size();i++) {
			sum = sum + num.get(i);
		}
		//display the sum of all element
		System.out.println("Sum of LinkedList is: "+sum);
		
		//To find the average of the LinkedList
		float average = (float)sum/num.size();
		
		//Print the average  of the LinkedList
		System.out.println("Average of LinkedList is :"+average);
	}

}
