package Java;

class Prsn
{
	String name;
	int age;
	void talk()
	{
		System.out.println("hii my name is :"+name);
		System.out.println("Age  "+age);
	}
}



public class Demo2 
{
	public static void main(String args[])
	{
		Prsn raju=new Prsn();
		raju.talk();
		
	}
}
