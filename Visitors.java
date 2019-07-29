package Java;

public class Visitors
{
  
   private String name;
   public void setName(String n) {
   name=n;
   
   }
   public String getName()
   {
	   return name;
	   }
   public static void main(String args[])
   {
	   Visitors vis=new Visitors();
	   vis.setName("jaiky");
	   System.out.println("hello " +vis.getName());
   }
   
}
