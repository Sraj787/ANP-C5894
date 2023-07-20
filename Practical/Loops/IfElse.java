package loops;

//simple If Else program
import java.util.*;
public class IfElse 
{
	public static void main(String[] args)
	{
	//Scanner class to take input from the user
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a value:");
	
	//integer input from the user 
	int a=sc.nextInt();
	
	//condition
	if(a>=18)
	{
		System.out.println("Eligible for voting");

	}
	else 
	{
		System.out.println("Not Eligible for voting");
	}
	sc.close();
	}
	}