package Java;

public class Constructor_Overloading 
{
  String name;
  int age;
  int id; 
  Constructor_Overloading(int i,String n)
  {
	  id = i;
	  name = n;
	  }
  Constructor_Overloading(int i,String n,int j)
    {
	  id =i;
	  name =n;
	  age =j;
	 }
  void display()
  {
	  System.out.println("Enter your Id"+id+ "\nName" +name+  "Age"+age);
	  
  }
  public static void main(String args[])
  {
	  Constructor_Overloading br = new  Constructor_Overloading(5,"Ram");
	  Constructor_Overloading br1= new  Constructor_Overloading(6,"Shyam",16);
	  br.display();
	  br1.display();
  }
}

