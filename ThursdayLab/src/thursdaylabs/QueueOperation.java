package thursdaylabs;
/*
Lab 1:Queue Operations
Write a Java program that demonstrates the usage of a Queue (LinkedList):
Enqueue a series of elements.
Dequeue elements from the Queue.
Print the elements after each dequeue operation.
 */

//Import the packages
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueOperation 
{

	public static void main(String[] args) 
	{
		//Creating Scanner class Object
		Scanner sc =new Scanner(System.in);
		//Creating Queue
		Queue<Integer> num = new LinkedList<>();
		
		//Print statement
		System.out.println("Enter the size of queue: ");
		//Store the input size of queue
		int size = sc.nextInt();
		
		//Print statement to enter the element
		System.out.println("Enter the elements: ");
		//Get the element as a input from the user
		for(int i=0;i<size;i++) 
		{
			//add the element in queue 
			num.add(sc.nextInt());
		}
		//Print the queue elements
		System.out.println("In queue elements are: "+num);
		
		//using for loop to remove the element from the queue
		for(int i=0;i<size;i++) {
			num.poll();//Remove the top element
			//Print the remaining element 
			System.out.println("Remaining element:"+num);
		}
		//Close the Scanner class
		sc.close();
	}

}
