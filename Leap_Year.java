package _pasted_code_;

import java.io.*;

public class Leap_Year
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the year");
		int year=Integer.parseInt(br.readLine());
		if(year%100==0 && year%400==0)
		
			System.out.println("leap year");
		
		else if(year % 100 !=0 && year % 4==0)
			System.out.println("leap year");
		else
			System.out.println("not leap year");
		
			
		
	}

}
