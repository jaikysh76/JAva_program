package Star;

import java.util.Scanner;

public class Program1 
{
   public static void PrintStar(int n)
   {
	   int i,j;
	   for(i=0;i<n;i++)
	   {
		   for(j=0;j<=i;j++) 
		   {
			 System.out.print("*");
		   } 
		   System.out.println();
	   }
	 }
   public static void main(String args[])
   {
	  // int n=5;
	  Scanner sc =new Scanner(System.in);            
	      
	  int n=sc.nextInt();
	   
	   System.out.println("Enter the Star no "+n);
	  PrintStar(n);
   }
   
}
