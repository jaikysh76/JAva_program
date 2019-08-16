package Polymorphism;
class Human
{
	void eat()
	{
		System.out.println("human are eating");
	}
}

public class Boy extends Human
{
	void  eat() {
     
      System.out.println("Boys are eating");
	}
      public static void main(String args[])
  	{
      Human obj=new Human();
      obj.eat();
	}
	
}
