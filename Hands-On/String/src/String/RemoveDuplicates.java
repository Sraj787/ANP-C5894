package String;

//program to remove string duplicates
import java.util.Scanner;

public class RemoveDuplicates 
{
  public static void main(String[] args)
  {
  	//Scanner class object
      Scanner scanner = new Scanner(System.in);
      
      //input for the string
      System.out.print("Enter a string: ");
      String input = scanner.nextLine();
      
      //calling removeDuplicates methods
      String a = removeDuplicates(input);
      
      System.out.println("String without duplicates: " + a);
      
      scanner.close();
  }
  
  //static method to remove duplicates
  public static String removeDuplicates(String str)
  {
      StringBuffer result = new StringBuffer();
      boolean[] seen = new boolean[256]; // ASCII character range 
      
      for (int i = 0; i < str.length(); i++)
      {
          char currentChar = str.charAt(i);
          if (!seen[currentChar]) 
          {
              result.append(currentChar);
              seen[currentChar] = true;
          }
      }
      
      return result.toString();
  }
}
