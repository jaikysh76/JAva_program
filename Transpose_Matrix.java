package _pasted_code_;
import java.io.*;
import java.util.*;

public class Transpose_Matrix 
{
  public static void main(String args[]) throws IOException
  {
	  Scanner sc = new Scanner(System.in);
	  //use Scanner to accept data from keyboard
	 
	  System.out.println("Enter rows and colums? ");
	  //accept rows ,columns of a matrix
	   int r =sc.nextInt(); //rows
	   int c =sc.nextInt(); //columns
	   
	  int arr[ ] [ ]= new int[r][c];
	  //create a matrix from Keyboard
	  
	  System.out.println("Enter the element of matrix");
	  for(int i=0;i<r;i++)
	  for(int j=0;j<c;j++)
	  arr [i][j]=sc.nextInt();
	  
	  //transpose of matrix
	  System.out.println("transpose of matrix ");
	  //take columns as rows and colums and vice versa aand display 
	  
	  for(int i=0;i<c;i++)
	  {
		  for(int j=0;j<r;j++)
		  {	  
			  System.out.print(arr[i][j]+"\t");
		  }
		  System.out.println("\n");
	  }
	  
	  
	  
	  
   }
}
