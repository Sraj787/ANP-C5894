package loops;
/*
 * 1.Grade Calculator:

Prompt the user to enter a numerical grade (0-100).
Use a switch case statement to determine the corresponding letter grade based on the following scale:
90-100: A
80-89: B
70-79: C
60-69: D
0-59: F
Display the letter grade to the user.
Handle input validation to ensure the grade is within the valid range.
 */

import java.util.*;
public class GradeCalculator {

	
	public static void main(String[] args) {
		
		//input from the user
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Welcome to the  Grade Calculator!");
	       System.out.println("-------------------------------");
	       System.out.print("Enter a numerical score (0-100): ");
	       
		//Declaring variable
		int grade = sc.nextInt();
		
		//If condition to check the numeric score will be greater then 0 or less then 100;	
		if(grade<0 || grade>100) {
			System.out.println("Please Enter a valid grade(0-100)");
			return;
			}	
	
		//switch condition 
		switch(grade/10) {
		
		case 10:{
			System.out.println("Grade of "+grade+" is: A");
			break;
		}
		case 9:{
			System.out.println("Grade of "+grade+" is: A");
			break;
	    }
		case 8:{
			System.out.println("Grade of "+grade+" is: B");
			break;
	    }
		case 7:{
			System.out.println("Grade of "+grade+" is: C");
			break;
	    }
		case 6:{
			System.out.println("Grade of "+grade+" is: D");
			break;
	    }
		default:{
			System.out.println("Grade of "+grade+" is: F");
		}
		}
		//close scanner class 
		sc.close();
	}

}
