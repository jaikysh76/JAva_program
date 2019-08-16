package Polymorphism;
 class Method
{
	void display()
	{
		System.out.println("Class:Method");
	}
}
class subclass extends Method
{
	void display()
	{
		super.display();
		System.out.println("class :subclass");
	}
}
public class Main 
{
  public static void main(String args[])
  {
	 
	 subclass obj1 =new subclass();
	  obj1.display();
  }
}
