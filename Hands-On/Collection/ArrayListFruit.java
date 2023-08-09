package collection;
/*
 2.Create an ArrayList of strings and add the following elements: "Apple", "Banana", "Orange", "Mango", "Grapes". Display the elements of the ArrayList.
 */

import java.util.ArrayList;
public class ArrayListFruit {

	public static void main(String[] args) {
		
		//Creating list of String
		ArrayList<String> fruit = new ArrayList<>();
		
		////Adding elements in list
		fruit.add("Apple");
		fruit.add("Banana");
		fruit.add("Orange");
		fruit.add("Mango");
		fruit.add("Grapes");
		
		// Accessing elements in the list or print the value
		System.out.println("ArrayList Is: "+ fruit);
		

	}

}
