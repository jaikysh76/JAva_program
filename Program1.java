package Java;

public class Program1
{
	private double num1,num2;
	Program1(double x, double y)
	{
		num1=x;
		num2=y;
	}
	void sum()
	{
		double res=num1+num2;
		System.out.println("sum"+res);

	}
	public static void main(String args[]) 
	{
		Program1 br=new Program1(10,22.5) ;
		br.sum();
		
	}
}

