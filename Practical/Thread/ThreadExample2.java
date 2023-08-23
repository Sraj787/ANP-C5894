package com.ThreadDemo.java;

//Creating ThreadOne class
class ThreadOne implements Runnable
{
	@Override
	//Defining the run method 
	public void run()
	{
		//Using the for loop to print the 1 to 100 number
		for ( int i=0;i<=100;i++) 
		{
			//Print the value of the i  
			System.out.println("Value of i is: "+i);
		}
	}
}
//Creating ThreadTwo class
class ThreadTwo implements Runnable
{
	//Define the run method
	public void run() 
	{
		//Using the for loop to print the 1 to 100 number
		for ( int i=101;i<=200;i++) 
		{
			//Print the value of the i 
			System.out.println("Value of i is: "+i);
		}	
	}
}
//Creating main class
public class ThreadExample2 
{
	public static void main(String[] args) 
	{
		//Creating the object of the ThreadOne class
		ThreadOne tone = new ThreadOne();
		//Creating the object of the Thread class to implement the start method 
		Thread  t1 = new Thread(tone);
		t1.start();
		
		//Creating the object of the ThreadOne class
		ThreadTwo ttwo = new ThreadTwo();
		//Creating the object of the Thread class to implement the start method 
		Thread t2 = new Thread(ttwo);
		t2.start();
	}

}
