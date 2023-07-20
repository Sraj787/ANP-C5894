package loops;
/*
Temperature Conversion:
Switch case hands-on
Prompt the user to enter a temperature in Celsius.
Provide a menu to choose the conversion type: Fahrenheit, Kelvin, or Rankine.
Use a switch case statement to perform the selected conversion and display the result.
Handle invalid conversion choices appropriately.
 */
import java.util.*;
public class TemperatureConverter {

	public static void main(String[] args) {
		//Scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Temperature Converter app!");
		System.out.println("-----------------------------------");
		System.out.print("Enter a temperature in celsius: ");
		
		//input variable for temperature
		double temp = sc.nextDouble();
		
		//Menu for Switch
		System.out.println("Menu:");
		System.out.println("1.Convert Celsius to fahrenheit");
		System.out.println("2.Convert Celsius To Kelvin");
		System.out.println("3.Convert Celsius To Rankine");
		
		System.out.print("Enter Menu Number:");		
        int    menunumber =sc.nextInt();
        
        //Store the Converted value in this variable
        double convert;
        
        //Switch case to Select on case 
        switch(menunumber) {
        
        case 1:{
        	convert = (temp * 1.8) + 32;
        	System.out.println("Convert Celsius to fahrenheit is: "+ convert +" F");
        	break;
        }
        
        case 2:{
        	convert = (temp + 273.15);
        	System.out.println("Convert Celsius to kelvin is: "+ convert+ " K");
        	break;
        }
        	
        case 3:{
        	convert = (temp * 1.8) + 491.67;
        	System.out.println("Convert Celsius to rankine is: "+ convert+" R");
        	break;
        }
        	
        default:{
        	System.out.println("Please Enter valid menu number!");
        	break;
        }       	
        }
    //close scanner class    
	sc.close();	
	}

}
