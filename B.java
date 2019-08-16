package Single_inheritance;

public class B extends  A
{
   void methodB()
   {
	   System.out.println("this is child class");
   }
   public static void main(String args[])
   {
	   B obj=new B();
	   obj.methodA();
	   obj.methodB();
   }
}
