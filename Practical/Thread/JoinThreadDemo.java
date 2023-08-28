package com.ThreadDemo.java;

//Creating New class extends with the Thread class
public class JoinThreadDemo extends Thread {
	//Its contain main task of the thread
	public void run() //Call the run method from the thread class
	{   
		//using the for loop to print the 1 to 5
		for (int i=1;i<=5;i++) 
		{
			//Using try & catch block to handle the exception
			try 
			{
				//Using the sleep method 
				Thread.sleep(1000);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			//Print the result
			System.out.println("i is "+i);
		}
	}
	
	public static void main(String[]args) 
	{
		//Creating a object of the JoinThreadDemo class
		JoinThreadDemo t1 = new JoinThreadDemo();
		JoinThreadDemo t2 = new JoinThreadDemo();
		JoinThreadDemo t3 = new JoinThreadDemo();
		
		//using the Start method to start the Thread & execute the Run method
		t1.start();
		try {
			//using Join method to make the currently executing thread to wait some other threads to finish their task
			t1.join();
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		//using the Start method to start the Thread & execute the Run method
		t2.start();
		try 
		{
			//using Join method to make the currently executing thread to wait some other threads to finish their task
			t2.join();
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		//using the Start method to start the Thread & execute the Run method
		t3.start();
	}
	

}
