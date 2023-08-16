package ExceptionHandling;



public class NullPointerExc 
{
	public static void main(String[] args)
    {
        String a = null; // Initializing a reference variable with null
        
        try 
        {
            int length = a.length(); // This line will throw a NullPointerException
            //Display the result
            System.out.println("Length of the text: " + length);
        }
        catch (NullPointerException e)
        {
        	//after catch exception to display the print statement
            System.out.println("An error occurred: " + e.getMessage());
        }
        //Print statement 
        System.out.println("Program continues...");
        
		
    }
}
