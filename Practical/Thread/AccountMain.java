package com.ThreadDemo.java;

class Account extends Thread{
	
	 static int balance=1000; 
	public void run() {
		synchronized(Account.class) {
	if (balance>=800) {
		System.out.println(Thread.currentThread().getName()+" "+"Your Current balance is "+balance+" Withdraw amount is 800");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		balance = 200;
		System.out.println(Thread.currentThread().getName()+" After Withdrawal your balance is "+balance);
	}
	else {
		System.out.println(Thread.currentThread().getName()+" "+"Your current balance is "+balance+" You can't withdraw the money");	
	}
	}
	}
}

public class AccountMain {

	public static void main(String[] args) {
		Account  holder1 = new Account();
		holder1.setName("Sarthak");
		Account  holder2 = new Account();
		holder2.setName("Vipin");
		holder1.start();
		holder2.start();
		
		

	}

}
