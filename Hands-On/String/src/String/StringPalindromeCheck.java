package String;

import java.util.Scanner;

public class StringPalindromeCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String input = sc.next();

		Palindrome.Check(input);
	}

}

class Palindrome{
	public static void Check(String input) {
		String temp ="";
		char ch;
		
		for (int i=0;i<input.length();i++) {
			ch = input.charAt(i);
			temp = ch + temp;
		}
		
		if(input.equals(temp)) {
			System.out.println("Given String is Palindrome");
		}else
		{
			System.out.println("Given String is not Palindrome");
		}
	}
}