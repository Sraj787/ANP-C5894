package collection;

import java.util.Vector;

public class VectorExample 
{
    
    public static void main(String[] args) 
    {
        // Create a Vector to store integers
        Vector<Integer> vector = new Vector<>();

        // Adding elements to the Vector
        vector.add(10);
        vector.add(20);
        vector.add(30);

        // Accessing elements
        System.out.println("All element: " +vector);
        System.out.println("First element: " + vector.get(0));
        System.out.println("Second element: " + vector.get(1));
        System.out.println("Third element: " + vector.get(2));

        // Size of the Vector
        System.out.println("Vector size: " + vector.size());

        // Check if the Vector is empty
        System.out.println("Is Vector empty? " + vector.isEmpty());

        // Iterating over the Vector elements using a for loop
        System.out.println("Vector elements:");
        for (int i = 0; i < vector.size(); i++)
        {
            System.out.println(vector.get(i));
        }
        
        // Removing an element from the Vector
        vector.remove(1);
        System.out.println("After removing the second element: " + vector);

        // Clearing the Vector
        vector.clear();
        System.out.println("After clearing the Vector: " + vector);
    }
}
