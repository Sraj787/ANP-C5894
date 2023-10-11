package String;

/*StringBuffer example
Write a Java program to check if a given string is a palindrome using StringBuffer.
 A palindrome is a string that reads the same forwards and backwards.
*/ 

public class PalindromeCheck {
    public static void main(String[] args) {
        String input = "radr"; // Change this string to test different cases
        
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
    
    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        StringBuffer reversed = new StringBuffer(str).reverse();
        return str.equals(reversed.toString());
    }
}
