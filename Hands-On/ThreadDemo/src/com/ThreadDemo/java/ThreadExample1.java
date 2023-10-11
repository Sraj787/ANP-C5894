package com.ThreadDemo.java;

//Creating Thraed1 class  
class Thread1 extends Thread
{
	//Implement the the run method 
	public void run() 
	{
		//Using the for to print the 1 to 100 number
		for (int i=0;i<=100;i++) 
		{
			//print the value of i
			System.out.println("Value of i is: "+ i);
		}
	}
}
//Creating Thraed2 class extends with Thread class
class Thread2 extends Thread
{
	public void run() 
	{
		//Using the for loop to print the 1 to 100 number
		for (int i=101;i<=200;i++) 
		{
			//Print the value of the i 
			System.out.println("Value of i is: "+ i);
		}
}
}
public class ThreadExample1 
{
	public static void main(String[] args) 
	{
		
		//Creating the object of the Thread1 class
		Thread1 t1 = new Thread1();
		t1.start();

		//Creating the object of the Thread2 class
		Thread2 t2 = new Thread2();
		t2.start();
	}

}
