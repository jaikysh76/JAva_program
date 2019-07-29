package Java;
class Demo
{
	//properties -variables
		String name ;
		int age;
		
		//actions -methods
		
		void talk()
		{
			System.out.println("My name is "+name);
			System.out.println("age "+age);
		}
	  
	}
public class Person{
		public static void main(String args[])
		{
			//create Person class Class object:raju
			Person Raju=new Person();
			System.out.println("Hash code\t" +Raju.hashCode());
			
		}
}
