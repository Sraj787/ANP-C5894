package oops;
//Example of multilevel inheritance
//super class or base class or parent class

class Vehicle 
{
//Fields & Method for Vehicle 	 
 public String brand;
 public int year;

 public void displayinfo(){
	 brand = "BMW";
	 year  = 2000;
	 System.out.println("Vehicle Brand"+ brand);
	 System.out.println("Vehicle Year"+ year);
 }
 }

class Car extends Vehicle
{
//Fields & Method for Car
	String model;
	public void model() {
     model ="BMW 7 Series";
	}
}

class SportCar extends Car
{
//Fields & Method for SportCar 	
	String topspeed;
public void displayinfo() {
	topspeed = "120kmh";
	brand = "BMW";
	year  = 2023;
	System.out.println("Vehicle Brand:"+ brand);
	System.out.println("Vehicle Year:"+ year);
	System.out.println("Car Model:"+ model);
	System.out.println("Car Top Speed:"+ topspeed);
}
}

class VehicleMain
{
	public static void main(String[] args)
	{
//Creating Object of Subclass		
	SportCar carinfo= new SportCar();
//Access The  Fields & Method  	
	carinfo.model();
	carinfo.displayinfo();
	}
}
