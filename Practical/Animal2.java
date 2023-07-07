package oops;

	//Example of Abstraction
	abstract class Animal2 
	{
		//contains abstract method
		//Abstract method does not have body
		public abstract void sound();
		
		//can contain non abstract method
		public void sleep()
		{
			System.out.println("Animals Sleep....");
		}
	}

	//subclass inherits Animals
	class Monkey extends Animal2
	{
		public void sound()
		{
			System.out.println("Monkey sounds like human....");
		}	
	}
	class Animal2Main
	{
		public static void main(String[] args)
		{
			Monkey m=new Monkey();
			m.sound();
			m.sleep();
		}
	}

