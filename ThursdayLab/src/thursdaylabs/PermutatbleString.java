package thursdaylabs;

import java.util.Scanner;

public class PermutatbleString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		
		String word = sc.next();
		
		String s = "";
		String r = word;
		
        for (int i = 0; i < r.length(); i++)
        {
            String newS= s + r.charAt(i);
 
            String newR = r.substring(0, i) +
                    r.substring(i + 1);
            System.out.println(newS+""+newR);
        }
        
        String reversed = reverseString(word);
        
        for (int i = 0; i < reversed.length(); i++)
        {
            String newS= s + reversed.charAt(i);
 
            String newR = reversed.substring(0, i) +
            		reversed.substring(i + 1);
            System.out.println(newS+""+newR);
        }
		sc.close();

	}
	public static String reverseString(String str) 
	  {
	      StringBuffer reversed = new StringBuffer(str).reverse();
	      return reversed.toString();
	  }

}
