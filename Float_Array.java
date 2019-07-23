package _pasted_code_;

public class Float_Array 
{
	public static void main(String args[])
	{
		float x[] [] = {{1.2f,1.3f,1.4f,1.5f,1.6f},{2.1f,2.2f,2.3f,2.4f,2.5f}};
		System.out.println("In Matrix form");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(x[i][j]+"\t");
			}
			System.out.println(" ");
			
		}
		
	}
}
