package thursdaylabs;

/*
 Question 4: Create an abstract class called "Vehicle" with abstract methods "start()" and "stop()". 
 Create two subclasses "Car" and "Motorcycle" that extend the "Vehicle" class and implement the abstract methods.
  Write a Java program to demonstrate starting and stopping operations for a car and a motorcycle.
 */
  public abstract class Vehicle 
{
	  //Abstract method 
	  public abstract void start();
	  public abstract void stop();
}

  //Car is a Sub class of Vehicle
  class Car extends Vehicle
{
	  public void start() 
	  {
		  System.out.println("Car is Start");
	  }
	  public void stop() 
	  {
		  System.out.println("Car is Stop");
	  }
}
  //Motorcycle is a sub-class of Vehicle
 class Motorcycle extends Vehicle
{
	 public void start() 
	 {
		  System.out.println("MotorCycle is Start");
	  }
	  public void stop() 
	  {
		System.out.println("MotorCycle is Stop");  
	  }
 }
 //Creating Main class
 class VehicleMain
 {
	 public static void main(String[] args) 
	 {
		 //Creating a object
		 Car car = new Car();
		 Motorcycle motor = new Motorcycle();
		 
		 //Print the value of the Car class
		 car.start();
		 car.stop();
		 
		 //Print the value of the Motorcycle class
		 motor.start();
		 motor.stop();
	 }
 }