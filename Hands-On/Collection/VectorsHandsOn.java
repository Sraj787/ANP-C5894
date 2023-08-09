package collection;
/*
 2.Create a program that represents a basic play-list using a Vector to store song names. Implement methods to:
a. Add songs to the play-list.
b. Display the current play-list.
c. Remove a song from the play-list.
 */

//Import java package - Vector
import java.util.Vector;
public class VectorsHandsOn 
{

	public static void main(String[] args) 
	{
		
		// Create a Vector to store String
		Vector<String> playlist =new Vector<>();
		
		
		//Adding the element in vector playlist
		playlist.add("Infected");
		playlist.add("Jaadugar");
		playlist.add("Labon Ko");
		playlist.add("Alla Hafiz");
		playlist.add("Pasoori");
		
		//Print the play list
		System.out.println("Current playlist: "+playlist);
		
		//Remove the some play list song name using index value
		playlist.remove(2);
		playlist.remove(0);
		
		//Print the updated Song play list
		System.out.println("Updated playlist:" +playlist);
		

	}

}
