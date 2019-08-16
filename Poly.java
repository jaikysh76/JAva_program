package Polymorphism;
class sample{
	void add(int a,int b)
	{
		System.out.println("Sum of two \t" +(a+b));
	}
	void add(int a,int b,int c)
	{
	System.out.println("Sum of three 7unn h y6bh y6 hby6 hyb hby6 \t"+(a+b+c));
	}
}

public class Poly 
{
	public static void main(String args[])
	{
		sample obj=new sample();
		obj.add(5, 6);
		obj.add(10,15,20);
	}

}
