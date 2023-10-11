package thursdaylabs;

/*Question 2:
 * Write a Java program that creates a bank account with concurrent deposits and withdrawals using threads.
 */

class Customer
{  
	//declaring the variable or initialize
	int amount=10000;  
  
	//Creating Withdraw method
	synchronized void withdraw(int amount)
	{  
		//Print statement
		System.out.println("going to withdraw...");  

		if(this.amount<amount)
		{  
			////Print statement
			System.out.println("Less balance; waiting for deposit...");  
			
			//try & catch block to handle the exception
			try{wait();}
       
			catch(Exception e){}  
		}
		//Deduct the amount from account
		this.amount=this.amount-amount; 
		
		//after withdraw Print statement
		System.out.println("withdraw completed...");  
   }
	
	//Creating deposit method
	synchronized void deposit(int amount)
	{ 
	  //Print statement
	  System.out.println("going to deposit...");
     
	  //Add the amount in account
	  this.amount=this.amount+amount; 
	
	  //Print statement
	  System.out.println("deposit completed... ");  
     
	  notify();  
   }  
}  
public class AccountManage 
{
	public static void main(String[] args) 
	{
		  {  
			  //Creating object of Customer class
			     Customer c=new Customer();  
			     
			     //Creating new Thread
			     new Thread()
			      { //Creating run method 
			        public void run()
			         {
			        	//Using withdraw method withdraw the amount
			        	c.withdraw(15000);
			         }
			      }.start();//start the thread call the run method  
			     
			    //Creating new Thread
			     new Thread()
			      {  
			    	//Creating run method  
			        public void run()
			         {
			        	//Using deposit method deposit the amount
			        	c.deposit(12000);
			        }  
			      }.start();//start the thread call the run method  
			  
		  }
	}

}
