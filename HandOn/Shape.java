package oops;
//Example of Single level inheritance
//super class or base class or parent class
class Shape{
//Method For Shape	
public void CalculateArea() 
{
	System.out.println("Calculating area of the Shape:");
}
}
class Rectangle extends Shape
{
//Method for Rectangle
//Override 	
public void	CalculateArea()
{
	System.out.println("Area Of a Rectangle");
		
}
}
class CalculateAreaMain
{ 
	public static void main(String[] args) 
	{
//creating object of sub class		
	Rectangle area = new Rectangle();
//access the methods	
	area.CalculateArea();
}
}

