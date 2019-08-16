package Inheritance;
class One
{
	//super class var
	int i=10;
	void show()
	{
		System.out.println("Super class method i" +i);
	}
}
class Two extends One
{
	//sub class var
	int i=20;
	void show()
	{
		System.out.println("Sub class method i= "+i);
	}
	
}
public class Super1 
{
	public static void main(String args[])
	{
		//create sub class object
		Two obj=new Two();
		obj.show();
		One obj1=new One() ;
		obj1.show();
	}

}
