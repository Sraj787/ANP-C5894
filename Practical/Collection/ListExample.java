package collection;

import java.util.ArrayList;
import java.util.List;
public class ListExample
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

	}
}