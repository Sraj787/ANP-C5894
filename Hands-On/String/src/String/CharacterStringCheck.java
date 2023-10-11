package String;

import java.util.Scanner;

public class CharacterStringCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String :");
		String input = sc.next();
		
		System.out.println("Enter the character :");
		char ch = sc.next().charAt(0);

		Character1.CharCheck(input,ch);
		
		System.out.println("After removing character :");
		CharacterRemove.RemoverChar(input,ch);
		
		DigitString.Check(input);
	}

}
class Character1{
	public static void CharCheck(String input,char ch) {
		char word;
		String newword="";
		int count=0;
		for (int i=0;i<input.length();i++) {
			word = input.charAt(i);
			if(word == ch) {
				count++;
			}
		    
		}
		System.out.println("Count of "+ch+" is :"+count);
	}
}

class CharacterRemove
{
	public static void RemoverChar(String input,char ch) 
	{
		char word;
		String newword="";
		
		//int count=0;
		for (int i=0;i<input.length();i++) 
		{
			word = input.charAt(i);
			if(word == ch) 
			{
				continue;
			}
		    newword = newword+word;
		}
		System.out.println("new word: "+newword);	
	}
	
}
class DigitString{
	public static void Check(String input) {
		int count=0;
		System.out.println("Digit are:");
		for (int i=0;i<input.length();i++) {
			if(Character.isDigit(input.charAt(i))) {
				System.out.print(input.charAt(i));
				count++;
			}
		}
		System.out.println();
		System.out.println("Total digit in string is:"+count);
	}
}
