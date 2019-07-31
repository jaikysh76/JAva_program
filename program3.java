package Java;
 
class Ram
{
	double num1,num2;
	Ram(double x,double y)
	{
		num1 =x;
		num2 =y;
		
	}
	 double sum()
	{
		double res =num1+num2;
		return res;
	}
}
public class program3
{
	public static void main(String args[])
	{
		Ram br=new Ram(10,2.5);
		double x=br.sum();
		System.out.println("Sum" +x);
		
	
	}
}

 
