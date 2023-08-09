package collection;
/*
 Question 3: Stack Implementation
 Write a program that performs the following operations:
a) Push elements onto the stack.
b) Pop elements from the stack.
c) Check whether the stack is empty.
d) Display the elements in the stack.
 */

import java.util.Stack;

public class StackArrayList {

	public static void main(String[] args) {
		Stack<String> name =new  Stack<String>();
		
		//Adding element in the stack
		name.push("Sarthak");
		name.push("koli");
		name.push("Momin");
		name.push("Vikas");
		name.push("Vipin");
		
		//print the all element of the stack
		System.out.println("In Stack Element Are: "+name);
		
		//remove the element 
		System.out.println("Remove element is: "+name.pop());//last element is remove
		System.out.println("Remove element is: "+name.pop());//last element is remove
		
		System.out.println("After Removing Some Element : "+name);
		
		//Check Stack is empty or not
		System.out.println("Stack is Empty:"+name.isEmpty());
		
		//Print the current  Stack
		System.out.println("Current Satck is: "+name);
		

	}

}
