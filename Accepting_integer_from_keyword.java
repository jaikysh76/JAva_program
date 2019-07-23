package _pasted_code_;
import java.io.*;

public class Accepting_integer_from_keyword
{
  public static void main(String args[]) throws IOException
  {
	  BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	  {
		  System.out.println("Enter the numbers: ");
		  int num =Integer.parseInt(br.readLine());
		  System.out.println("you entered: " +num);
	  }
  }
}
