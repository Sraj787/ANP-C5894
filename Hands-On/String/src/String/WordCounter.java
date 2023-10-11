package String;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCounter {

	public static void main(String[] args) {

		String fileName = "data.txt"; // Change this to your file name
		
		int count =countWords(fileName);
        System.out.println("Total number of lines in the file: " + count);
    }
    
    public static int countWords(String fileName) {
    	int count = 0;
        String line;
        try ( BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while ((line = reader.readLine()) != null) {
            	String words[] = line.split("");   
                count = count + words.length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return count;
	}

}
