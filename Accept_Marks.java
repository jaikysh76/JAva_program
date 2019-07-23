package _pasted_code_;

import java.io.*;

public class Accept_Marks 
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many subject");
		int n =Integer.parseInt(br.readLine());
		
		int marks[]=new int [n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter marks\t"+marks[i]);
			
			marks[i]=Integer.parseInt(br.readLine());
			}
			
			//find total marks
			
			int tot =0;
			for(int i=0;i<n;i++)
			tot +=marks[i];
			System.out.println("Total Marks=  "+tot);
			
			
			//find percentage
			
			float percent=(float)tot/n;
			System.out.println("Percentage = " +percent);
			
			
		}
		
		
				
	}

