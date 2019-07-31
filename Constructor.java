package Java;
 class Persong
 {
	 //initialise the variables
	private String name;
	 private int age;
	 //default constructor
	 Persong()
	 {
	    name="Raju";
	    age=22;
     }
 //method
 void talk()
 { 
	 System.out.println("Hello i am "+name);
	 System.out.println("MY AGE IS "+age);
 }
	 
 }
public class Constructor
{
	public static void main(String arg[]) 
	{
		//create person class object:Raju
		Persong Raju=new Persong();
		Raju.talk();
		//create person class object :sita
		Persong Sita =new Persong();
		Sita.talk();
		
	}

}
