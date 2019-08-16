package Inheritance;

public class Hit_teacher extends ComTeacher
{
   String dept ="Cse";
   public static void main(String args[])
   {
	    Hit_teacher Abc =new Hit_teacher();
	     System.out.println("the dept name is "+Abc.dept);
	     System.out.println("teacher desingnation "+Abc.desingnation);
	     System.out.println("the college name "+Abc.CollegeName);
	     System.out.println("teacher name"+Abc.Teachername);
	     Abc.tkg();
   }
}
