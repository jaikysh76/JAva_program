package _pasted_code_;

public class Str_Splt 
{
	public static void main(String args[])
	{
		// take a string str which is to be broken
		String str ="my name is jaiky sharma";
		//declare a string type array s to store places 
		String s[];
		//split the string where a space is round in str
		s =str.split(" ");
		//display the prices from s
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
}
