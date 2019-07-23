package _pasted_code_;
import java.io.*;

public class Emp_Details
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter emp id");
		int n=Integer.parseInt(br.readLine());
		
		System.out.println("enter the sex M/F");
	//	char ch=(char)br.read();    
		char ch=br.readLine().charAt(0);
		
		System.out.println("enter the name"); 
		String name =br.readLine();
		
		System.out.println("the emp id is "+n);
		System.out.println(" sex M/F  "+ch);
		System.out.println("name "+name);
		
		
	}
}
