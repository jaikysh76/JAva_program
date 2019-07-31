package Java;
class Jaiky
{
	//initialise variable
	String name;
	int age;
	//default construstor
	Jaiky()
	{
		name="Kajal";
		age=22;
	}
	//parameterised constructor
	Jaiky(String s,int i)
	{
		name=s;
		age =i;
	}
		void talk()
		{
		System.out.println("HII i am "+name);
		System.out.println("My age is "+age);
		
	}
}

public class Cnstctr 
{
  public static void main(String args[])
  {
	  Jaiky Kajal =new Jaiky();
	  Kajal.talk();
	  
	  Jaiky Jai =new Jaiky("jaik",23);
	  Jai.talk();
	  
  }
}
