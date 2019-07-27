package _pasted_code_;
import java.io.*;

public class Leaner_String 
{
	public static void main(String args[]) throws IOException
	{
		//to accept data from keywords
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		// ask how many strings
		
		System.out.println("How many string ");
		int n=Integer.parseInt(br.readLine());
		
		//create string type array with size n
		
		String str[]=new String[n];
		
		//store string into str[]
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the string: ");
			str[i]=br.readLine();
		}
		
		//accept string to search
		System.out.println("Enter string to search: ");
		String search=br.readLine();
		
		//take boolean var
		boolean found =false;
		
		//search for the string in str[]
		
		for(int i=0;i<n;i++)  
		{
			if(search.equalsIgnoreCase(str[i]))
			{
				System.out.println("found at position " +(i+1));
				found=true;
				
			}
		}
		//if not found display message
		if(!found)
			System.out.println("Not found in a group");
				
	}
}
