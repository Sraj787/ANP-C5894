package oops;

class PolymorphismExample 
{
	// 2 types
	// 1.Method Overloading/ Compile-time polymorphism
	//same method name with different parameters & return type.
			
		public int sum(int a,int b) 
		{
			return a+b;
		}
		public int sum(int a,int b,int c) 
		{
			return a+b+c;
		}
		public double sum(double a,double b) 
		{
			return a+b;
		}
	}
	class PolymorphismMain
	{
		public static void main(String[] args)
		{
			PolymorphismExample p=new PolymorphismExample();
			System.out.println("The sum is :" + p.sum(10,10));
			System.out.println("The sum is :" + p.sum(20,30,10));
			System.out.println("The sum is :" + p.sum(20.50,10.00));
		}
	}

