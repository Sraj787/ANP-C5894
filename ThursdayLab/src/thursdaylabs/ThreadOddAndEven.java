package thursdaylabs;
/*Question 1:  
 * Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20.
 */

//Creating ThreadOdd class
class ThreadOdd extends Thread
{
	//Creating run method 
	public void run() 
	{
		//Using for loop to print the odd number 1 to 20
		for (int i=0; i<=20;i++ ) 
		{
			//if i value is divisible by 2 but reminder is equal to 0
			if (i%2==0) 
			{
				//print the results
				System.out.println("Number"+i+" is Odd.");
			}
		}
	}
}
//Creating new ThreadEven class
class ThreadEven extends Thread
{
	//Creating run method 
	public void run() 
	{
		//Using for loop to print the even number 1 to 20
		for (int i=0; i<=20;i++) 
		{
			//if i value is divisible by 2 but reminder is not equal to 0
			if (i%2!=0) 
			{
				//print the results
				System.out.println("Number"+i+" is Even.");
			}
		}
	}	
}
//Creating new ThreadOddAndEven class
public class ThreadOddAndEven 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//Creating the object of the ThreadOdd class
		ThreadOdd  num = new ThreadOdd();
		//Call the start method from thread class
		num.start();//start method call run method
		num.sleep(500);
		
		//Creating the object of the ThreadEven class
		ThreadEven  num1 = new ThreadEven();
		//Call the start method from thread class
		num1.start();//start method call run method
	}

}
