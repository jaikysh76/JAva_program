package _pasted_code_;

import java.io.*;
 

public class Swaap 
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How Many elements");
		int n =Integer.parseInt(br.readLine());
		int arr[]= new int[n];
		
		//accept integer elements into the array
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter int: ");
			arr[i]=Integer.parseInt(br.readLine());
		}
		//use bubble sort technique to sort the integers
		int limit=n-1; //elements from  0 to n-1
		boolean flag =false; //if it is true swapping done
		int temp; //temp is temporary variables 
		for(int i=0;i<limit;i++)
		{
			for(int j=0;j<limit;j++)
			{
				//if first element bigger then second one,then swap
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true; //--->Swapping done
				}
			}
		  if(flag=false)
			  break;  //no swapping,so come out
		  else flag=false; //assign value 
		  }
		//display shorted array
	    System.out.println("the shorted array is :  ");
	    for(int i=0;i<n;i++)
		System.out.print(arr[i])
		
	}
}
