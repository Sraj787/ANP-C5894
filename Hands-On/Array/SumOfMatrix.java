package array;
//Find the sum of 2 matrix

import java.util.*;
public class SumOfMatrix 
{

	public static void main(String[] args) 
	{

		//Scanner class object 
		Scanner sc = new Scanner(System.in);
		
		//Step1: Get the Size of  multidimensional array from the user as a input  
		System.out.println("Enter the row: ");
		int rows = sc.nextInt();
		
		System.out.println("Enter the columns: ");
		int columns = sc.nextInt();
		
		//Step2: Create the multidimensional array based on user input size
		//First array
		int[][] array = new int[rows][columns];
		
		System.out.println("Enter elements for the array:");
		
		//To get the element from the user for loop
		for(int i=0;i<rows;i++) 
		{
			for(int j=0;j<columns;j++) 
			{
				array[i][j] = sc.nextInt();
			}
		}
		System.out.println("First matrix is : ");
		//To print the element value using for loop
		 for (int i = 0; i < rows; i++) 
	      {
	          for (int j = 0; j < columns; j++)
	          {
	              System.out.print(array[i][j] + " ");
	          } 
	          System.out.println();
	      }
		
		//step3: Create second multidimensional array based on user input size
		//Second array 
		int[][] array1 = new int[rows][columns];
		
		//To get the element from the user for loop
		for(int i=0;i<rows;i++) 
		{
			for(int j=0;j<columns;j++) 
			{
				array1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Second matrix is: ");
		//To print the element value using for loop
		 for (int i = 0; i < rows; i++) 
	      {
	          for (int j = 0; j < columns; j++)
	          {
	              System.out.print(array1[i][j] + " ");
	          }
	          System.out.println();
	      }
		
		//Step4: Adding the both matrix
		int[][] sum = new int[rows][columns];
		
		//To add the each element value using for loop
		for(int i=0;i<rows;i++) 
		{
			for(int j=0;j<columns;j++) 
			{
				sum[i][j]=array[i][j] + array1[i][j];
			}
		}
		//To print the blank space 
		System.out.println();
		System.out.println("Sum of both matrix is : ");
		//To print the element value using for loop
		 for (int i = 0; i < rows; i++) 
	      {
	          for (int j = 0; j < columns; j++)
	          {
	              System.out.print(sum[i][j] + " ");
	          }
	          System.out.println();
	      }
		 
		//Step5: Finding the Sum of the all element of matrix and finding the average of the matrix
		 
		 float average=0;//store the average of matrix in float
		 int total=0;//store sum of all element of the matrix
		 
		 //using for loop to calculate the sum of the all element 
		 for (int i = 0; i < rows; i++) 
	      {
	          for (int j = 0; j < columns; j++)
	          {
	              total=total+sum[i][j];
	          }    
	      }
		 //print sum of all element 
		 System.out.println("Sum Of matrix is : "+ total);
		
		 //calculate the average of the matrix
		 average = (float)total/(rows*columns);
		 //print the average of matrix
		 System.out.println("Average of matrix is : "+ average);

		//close the scanner class
		sc.close();	
	}

}
