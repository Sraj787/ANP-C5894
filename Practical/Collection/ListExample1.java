package collection;

import java.util.ArrayList;
import java.util.List;
public class ListExample1
{

	public static void main(String[] args)
	{
		//create list of integers
		List<Integer> num= new ArrayList<>();
		
		//Adding elements in list
		num.add(12);
		num.add(20);
		num.add(10);
		num.add(11);
		
		 // Accessing elements in the list
        System.out.println("List: " + num);
        
        // Updating elements in the list
        num.set(1, 25);
        System.out.println("Updated List: " + num);
        
        // Removing elements from the list
        num.remove(3); // Removes the element at index 3
        System.out.println("List after removing element at index 3: " + num);
        
        //Getting value at index 0
        int firstElement = num.get(0);
        System.out.println("First Element: " + firstElement);
        
        //To check for a specific number
        boolean contains = num.contains(30);
        System.out.println("Contains 30? " + contains); // Output: false 

        // Finding the index of an element
        int indexOfElement = num.indexOf(25);
        System.out.println("Index of 25: " + indexOfElement); // Output: 1

     // Size of the list
        int size = num.size();
        System.out.println("Size of the list: " + size);

        // Clear the list
        num.clear();
        System.out.println("List after clearing: " + num);

        // Check if the list is empty
        boolean isEmpty = num.isEmpty();
        System.out.println("Is list empty? " + isEmpty);

	}

}