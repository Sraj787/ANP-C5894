package thursdaylabs;
/*Lab 2:List Sorting
Write a Java program that sorts a list of strings in alphabetical order using the Collections framework
*/

//Import the java packages
import java.util.*;
public class OrderOfAlphabet 
{

	public static void main(String[] args) 
	{
		//Creating Scanner class object 
		Scanner sc = new Scanner(System.in);
		//Creating ArrayList
		List<String> alphabet = new ArrayList<>();
		
		//Print statement to enter the size of the list
		System.out.println("Enter the size of list :");
		//Get input from the user
		int size = sc.nextInt();
		
		//Print statement to Enter the element in list
		System.out.println("Enter the element in list: ");
		//for loop using get the element as a input from the user 
		for(int i=0;i<size;i++) 
		{
		//Store the element 	
		alphabet.add(sc.next());
		}
		//Print the all element 
		System.out.println("In a list element are: "+alphabet);
		
		//Using Collections class or sort method to sort the ArrayList
		Collections.sort(alphabet);
		
		//Print the sorted ArrayList
		System.out.println("Sorted list: "+alphabet);
		//Closing the Scanner class
		sc.close();
	}

}
