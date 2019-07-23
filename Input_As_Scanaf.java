package _pasted_code_;
import java.io.*;
import java.util.*;

public class Input_As_Scanaf
{
   public static void main(String args[]) throws IOException
   {
	   //to accept data from keyboard
	   BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	   System.out.println("enter name,age sallary");
	  
	   //accept input into a string 
	   String str =br.readLine();
	   
	   //use StringTokenizern to split input at commas
	   StringTokenizer st=new StringTokenizer(str, ",");
	   
	   //we will have 3 Tokens as strings
	   String s1=st.nextToken();
	   String s2=st.nextToken();
	   String s3=st.nextToken();
	   
	  //trim any spaces before and after the tokens 
	   s1=s1.trim();
	   s2=s2.trim();
	   s3=s3.trim();
	   
	   //convert s1 into string,s2 into an s3 into a float 
	   String name =s1;
	   int age =Integer.parseInt(s2);
	   float sal=Float.parseFloat(s3);
	   
	   System.out.println("Name" +name );
	   System.out.println("age" +age);
	   System.out.println("Salary" +sal);
	   
	   
	   
}
   
}
