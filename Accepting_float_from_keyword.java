package _pasted_code_;
import java.io.*;

public class Accepting_float_from_keyword 
{
   public static void main(String args[]) throws IOException
   {
	   BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	   System.out.println("Enter your value");
	   float n =Float.parseFloat(br.readLine());
	   System.out.println("you entered " +n);
	   
   }
}
