package Polymorphism;
class Empl
{
	float salary =100000;
	
}
class Man extends Empl
{
	
	float salary=200000;
	void display()
	{
		System.out.println("Salary"+salary);
	}
}

public class Super_keyword 
{
  public static void man(String args[])
  {
	  Man obj =new Man();
	  obj.display();
  }
}
