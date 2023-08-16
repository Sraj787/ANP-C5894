package thursdaylabs;
/*
 Question 3: Create a superclass called "Shape" with properties like "numSides" and "color". 
 Create three subclasses "Triangle", "Square", and "Circle" that inherit from "Shape" and
  have additional properties like "sideLengths" for triangle and square, and "radius" for the circle. 
 Write a Java program to display the details of a triangle, a square, and a circle.
 */

//Super class or parent class
 class Shape 
 {
	 //Methods for shape class
	 public void numSides() 
	 {
		 System.out.println("Number of sides");
	 }
	 public void color() 
	 {
		 System.out.println("Color:Red");
	 }
}
//Triangle class is sub class of the Shape
 class Triangle extends Shape
 {
	//Methods for Triangle class 
	public void numSides()
	 {
		//Print the side of triangle
		 System.out.println("Triangle have a three side");
	 }
	 public void sideLengths()
	 {
		//Print the length of triangle
		 System.out.println("Triangle have a three side length");
	 }
	 public void color() 
	 {
		//Print the color of the triangle
		 System.out.println("Color:Blue");
	 }
 }
//Square class is sub class of the Shape
class Square extends Shape{
	//Methods for Square class
	public void numSides()
	{
		//Print the side of square
		 System.out.println("Square have a four side");
	}
	public void sideLengths()
	{
		//Print the length of square
		 System.out.println("Square have a four side length");
	}
	 public void color() 
	 {
		//Print the color of square
		 System.out.println("Color:Black");
	 }
 }
//Circle class is sub class of the Shape
class Circle extends Shape
{
	//Methods for Circle class
	public void radius()
	{
		//Print the radius of circle
		 System.out.println("Circle have a radius");
	 }
}

//Creating a main class
class ShapeMain
{
	public static void main (String[]args) 
	{
		
		//creating object for class
		Triangle tri = new Triangle();
		Square  square= new Square();
		Circle  cir = new Circle();
		
		//To get the value from the triangle class & print the value
		tri.color();
		tri.sideLengths();
		tri.numSides();
		
		//To get the value of the square class & Print the value
		square.color();
		square.sideLengths();
		square.numSides();
		
		//To get the value of Circle class & Print the value
		cir.color();
		cir.radius();
		
	}
}
