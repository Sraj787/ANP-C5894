package collection;
/*2.Create a program that represents a basic play-list using a Vector to store song names. Implement methods to:
a. Add songs to the play-list.
b. Display the current play-list.
c. Remove a song from the play-list.
 */
//Import java package - Vector
import java.util.Vector;
import java.util.Scanner;
public class HandsOnVector 
{
	public static void main(String[] args) 
	{
			Scanner sc =new Scanner(System.in);
			// Create a Vector to store String
			Vector<String> playlist =new Vector<>();
			
			//Print statement to enter the song name
			System.out.println("Enter the size of the playlist: ");
			int size = sc.nextInt();
			
			//Statement to enter a song name
			System.out.println("Enter the Song name:");
			//For loop to take input from or store number index
			for(int i=0;i<size;i++) 
			{
				playlist.addElement(sc.next());
			}
			//Print the current play list
			System.out.println("Current play list is : "+playlist);
			
			//statement to enter the how value you are remove
			System.out.println("Enter the how many remove");
			//store the remove value
			int  remove=sc.nextInt();
			//Using if condition to check the remove is less than play list size
			if(remove<size) {
			for(int i=0;i<remove;i++) 
			{
				playlist.remove(sc.nextInt());
			}
			//After removing print the play list
			System.out.println(" "+playlist);
			}
			//If remove is greater then play list size  
			else {
				//Print the Invalid!
				System.out.println("Invalid! Please Enter the less than size number:");	
			}
			
			//Close the Scanner class
			sc.close();
			
	}
}
