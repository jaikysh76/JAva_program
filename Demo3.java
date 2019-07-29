package Java;
class Jk
{
	String name;
	int age;
	void talk() {
		System.out.println("hii i am "+name);
		System.out.println("Age"+age);
	}
}

public class Demo3 
{
	public static void main(String args[])
	{
		Jk raju=new Jk();
		raju.name="Raju";
		raju.age = 22;
		raju.talk();
	}
}
