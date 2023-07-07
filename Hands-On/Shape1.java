package oops;

//Example of Abstraction
public abstract class Shape1 
{
	public abstract void CalculateArea();	
	public abstract void CalculateParameter();
}

class Rectangle1 extends Shape1
{
//Declaring variable 	
	int length = 10;
	int width =5;

//Creating Method for Rectangle	
		public void CalculateArea() {
		// l*b
		System.out.println("Area Of The Rectangle:"+ length*width);
}
		public void CalculateParameter() 
{
//2(l+b)
		System.out.println("Parameter of the Rectangle is:"+ 2*(length*width));
}
}


class Circle extends Shape1{
//Declaring variable 	
	int radius =4 ;
//Creating method for Circle	
   public void CalculateArea() 
 {
		//3.14*r2
	   System.out.println("Area Of The Circle:"+ (3.14*radius*radius));
}
	
	public void CalculateParameter() 
{
		//2*3.14*r
		System.out.println("Parameter of the circle is:"+ (2*3.14*radius));
}
}


class Triangle extends Shape1
{
//Declaring variable	
	int height =5 ;
	int base =4;
	int len =3;
//Creating method For Triangle class
	
public void CalculateArea() 
{
	//1/2*l*b
	System.out.println("Area Of The Triangle:"+ (0.5*base*height));	
}	
	public void CalculateParameter() 
{
		//l+b+c
		System.out.println("Parameter of the Rectangle is:"+ (base+height+len));
}
}

//Creating Main class
class CalculateMain
{
	public static void main(String[] args) 
{
		//Creating object for all classes
		Rectangle1 rect = new Rectangle1();
		Circle  cir = new Circle();
		Triangle tri = new Triangle();
		
		rect.CalculateArea();
		rect.CalculateParameter();
		cir.CalculateArea();
		cir.CalculateParameter();
		tri.CalculateArea();
		tri.CalculateParameter();
}
}

