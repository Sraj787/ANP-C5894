package String;

import java.util.Scanner;

public class VowelsConsonants {
	public static void Check(String input) {
		String vowels="aoueiAOUEI";
		int count=0;
		for (int i=0;i<input.length();i++) {
			for(int j=0;j<vowels.length();j++) {
			if(input.charAt(i) == vowels.charAt(j)) {
				System.out.println(input.charAt(i)+":"+i);
				count++;
			}
			}
		}
		System.out.println("Total vowels are:"+count);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String input = sc.next();
		
		Check(input);
		sc.close();

	}

}
