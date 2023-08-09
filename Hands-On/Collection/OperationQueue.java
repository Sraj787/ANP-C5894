package collection;
/*
 Question 4: Queue Operations
Design a program that demonstrates the use of a Queue:
a) Enqueue elements into the queue.
b) Dequeue elements from the queue.
c) Check whether the queue is empty.
d) Print the elements in the queue.
 */

import java.util.LinkedList;
import java.util.Queue;

public class OperationQueue {

	public static void main(String[] args) {
	
		Queue<String> animals= new LinkedList<String>();
		
		//Adding the element in the Queue
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Cow");
		animals.add("Pig");
		animals.add("Sheep");
		
		//Print the element of the queue
		System.out.println("In Queue Element Are: "+animals);
		System.out.println("Size of stack: "+animals.size());
		/*
		//remove the element in the Queue
		System.out.println(animals.remove());//First element remove in queue 
		System.out.println(animals.remove());//First element remove in queue
		*/
		int size = animals.size();
		for(int i=0;i<size;i++) {
			System.out.println(animals.remove());//First value remove than next
		}
		
		//to check the queue is empty
		System.out.println("Queue is empty: "+animals.isEmpty());
		
		//print the current queue
		System.out.println("Current Queue is: "+animals);
		

	}

}
