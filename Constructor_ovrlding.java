package Java;

public class Constructor_ovrlding 
{
	int rlno;
	Constructor_ovrlding()
	{
		rlno=100;
		
	}
	Constructor_ovrlding(int rolno)
	{
		this();
		rlno=rlno+rolno;
				
	}
	public int getRlNo()
	{
		return rlno;
	}
	public void setRlNo(int rlno)
	{
		this.rlno=rlno;
	}
	public static void main(String args[])
	{
		Constructor_ovrlding br= new Constructor_ovrlding(12);
		System.out.println(br.getRlNo());
		
	}
	

}
