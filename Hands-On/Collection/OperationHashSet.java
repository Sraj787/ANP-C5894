package collection;
/*
 Question 2: HashSet Operations
Create a program that showcases the usage of a HashSet:
a) Add elements to the set.
b) Check whether a specific element exists in the set.
c) Remove an element from the set.
d) Print the elements of the set.
 */

import java.util.HashSet;
import java.util.Set;
public class OperationHashSet {

	public static void main(String[] args) {
		Set<String> word = new HashSet<String>();
		
		//Adding the element in the Set
		word.add("A");
		word.add("C");
		word.add("D");
		word.add("B");
		word.add("A");
		
		//print the element of the set
		System.out.println("In HashSet Element are: "+word);
		
		//Creating new variable and store the value 
		String c ="C";
		//Check the value of c present in set or not
		System.out.println("Element Contains: "+c+" "+word.contains(c));
	
		//Remove the some element 
		word.remove("A");
		word.remove("B");
		
		//Print the set after removing some element
		System.out.println("After Removing The HashSet: "+word);

	}

}
