package collection;

import java.util.LinkedList;
//LinkedList Example
public class LinkedListExample 
{
  public static void main(String[] args) 
  {
      // Create a linked list of strings
      LinkedList<String> ls = new LinkedList<>();

      // Adding elements to the linked list
      ls.add("Apple");
      ls.add("Banana");
      ls.add("Orange");
      ls.add("Mango");

      // Accessing elements in the linked list
      System.out.println("Linked List: " + ls);

      String firstElement = ls.getFirst();
      System.out.println("First Element: " + firstElement); // Output: Apple

      String lastElement = ls.getLast();
      System.out.println("Last Element: " + lastElement);   // Output: Mango

      // Updating elements in the linked list
      ls.set(1, "Grapes");
      System.out.println("Updated Linked List: " + ls);

      // Removing elements from the linked list
      ls.remove(2); // Removes the element at index 2
      System.out.println("Linked List after removing element at index 2: " + ls);

      boolean contains = ls.contains("Orange");
      System.out.println("Contains Orange? " + contains); // Output: false (since we removed Orange)

      // Finding the index of an element
      int indexOfElement = ls.indexOf("Grapes");
      System.out.println("Index of Grapes: " + indexOfElement); // Output: 1

      // Size of the linked list
      int size = ls.size();
      System.out.println("Size of the linked list: " + size);

      // Clear the linked list
      ls.clear();
      System.out.println("Linked List after clearing: " + ls);

      // Check if the linked list is empty
      boolean isEmpty = ls.isEmpty();
      System.out.println("Is linked list empty? " + isEmpty);
  }
}