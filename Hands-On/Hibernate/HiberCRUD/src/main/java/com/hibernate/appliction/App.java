package com.hibernate.appliction;

import java.util.Scanner;

import com.hibernate.application.Daoimpl.EmployeDaoImpl;

public class App 
{
    public static void main( String[] args )
    {
        char a;
        EmployeDaoImpl impl = new EmployeDaoImpl();
        do {
        	@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
        	System.out.println("employee Registration");
        	System.out.println("1.Display 2.Add 3. Edit 4.Delete");
        	System.out.println("Enter your chioce");
        	int ch = sc.nextInt();
        	
        	switch(ch) 
        	{
			case 1: 
			 {
				System.out.println("1.Didplay details by Id 2.Display all details");
				int d = sc.nextInt();
				switch (d) 
			    {
				case 1: 
				{
					System.out.println("Enter the Employee Id:");
					impl.displayEmp(sc.nextInt());
					break;
				}
				case 2: 
				{
					impl.getDisplayEmp();
					break;
				}
				default: 
				{
					System.out.println("Enter valid input");
				}
        	    }
        	break;
        	 }
        	case 2:
        	 {
        		impl.addEmp();
        		break;
        	 }
        	case 3:
        	 {
        		System.out.println("Enter the Employee Id:");
        		impl.editEmp(sc.nextInt());
        		break;
        	 }
        	case 4:
        	 {
        		System.out.println("Enter the Employee Id:");
        		impl.deleteEmp(sc.nextInt());
        		break;
        	 }
        	case 5:
        	 {
        		System.exit(0);
        		break;
        	 }
        	}
        	System.out.println("Do you wont to continue Y/N");
        	a = sc.next().charAt(0);
            }
        	while(a == 'Y'|| a == 'y');
    
    }
}

