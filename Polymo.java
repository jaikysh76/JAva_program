package Polymorphism;
class Method_Overloading
{
	void display()
	{
		System.out.println("method overloading ..........");
	}
	void dispaly(int x)
	{
		System.out.println("Int.........");
	}
	void display(float y)
	{
		System.out.println("Flaot.........");
	}
	void display(char c)
	{
		System.out.println("Char...........");
	}
	void display(String s)
	{
		System.out.println("String.........");
	}
	void display(int a,float b)
	{
		System.out.println("int and floatc\t7" +a+ "," +b);
	}
	void display(char c,String s)
	{
		System.out.println("Char And String " +c+ ","+s);
	}
	
	
}

public class Polymo 
{
  public static void main(String args [])
  {
	  Method_Overloading obj=new Method_Overloading();
	  obj.display();
	  obj.display(3);
	  obj.display((float)6.5);
	  obj.display("j");
	  obj.display("jaiky");
	  obj.display(5,(float)7.8);
	  
	  
  }
}
