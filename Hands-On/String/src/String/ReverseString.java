package String;

//program for reverse String using StringBuffer class.
import java.util.Scanner;

public class ReverseString 
{
  public static void main(String[] args) 
  {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Enter a string: ");
      String input = scanner.nextLine();
      /*
       * String tem= "";
      char ch;
      for (int i=0;i<input.length();i++) {
    	  ch = input.charAt(i);
    	  tem = ch + tem;
      }
      System.out.println(tem);*/
    
      String reversed = reverseString(input);
      
      System.out.println("Reversed string: " + reversed);
      
      scanner.close();
  }
  
  public static String reverseString(String str) 
  {
      StringBuffer reversed = new StringBuffer(str).reverse();
      return reversed.toString();
      
  }
}
