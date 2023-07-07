package oops;

 class PolymorphismExample1 
 {
//Declaring Parameters & Method
	public int multi(int a,int b) 
	{
		return a*b;
	}
	public int multi(int a,int b,int c) 
	{
		return a*b*c;
	}
	public int multi(int a) {
		return a*a;
	}
 }

 //Creating Main Method
class PolymorphismExampleMain1
{
	public static void main(String[] arges) 
{
	//Creating object for class PolymophismExample1
	PolymorphismExample1 poly = new PolymorphismExample1();
	
	System.out.println("the answer of multiple:"+ poly.multi(5, 4));
	System.out.println("the answer of multiple:"+ poly.multi(3, 4, 2));
	System.out.println("the answer of multiple:"+ poly.multi(6));
}
}
