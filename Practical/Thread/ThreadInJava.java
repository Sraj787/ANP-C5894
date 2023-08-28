package com.ThreadDemo.java;

class ThreadI extends Thread
{
	//Its contain main task of the thread
	public void run() // running state
	{
		for(int i=0; i<=100; i++)
		{
			System.out.println(Thread.currentThread().getName() +" : " +i);
		}
	}
	
}
class ThreadII extends Thread
{
	//Its contain main task of the thread
	public void run()   // running state
	{
		for(int i=101; i<=200; i++)
		{
			System.out.println(Thread.currentThread().getName() +" : " +i);
		}
		
	}
}

public class ThreadInJava {

	public static void main(String[] args) throws InterruptedException {
	
		//Creating Object of the ThreadII class
		ThreadI t1=new ThreadI();  //new thread  // new state
		//Set the name of the thread
		t1.setName("Thread1");
		try {
		t1.setPriority(12);
		}
		catch(Exception ex)
		{
			System.out.println("argument galat hai");
		}
		t1.start();  // thread start hua//  runnable state
		t1.sleep(500);  // blocked state
		t1.stop();  // thread terminate/dead/ end
		//stop method is deprecated
		
		//IsAlive method to check the Thread alive or not & display the boolean result
		System.out.println(t1.isAlive());
		
		//print statement
		System.out.println("ye main thread ka task hai");
		//Creating Object of the ThreadII class
		ThreadII t2=new ThreadII();
		//Set the name of the thread
		t2.setName("Thread2");
		t2.setPriority(1);
		t2.start();
		
		
	}

}
//In method value
//public void run(int) is parameter
//public void run(12)is argument && ; 
