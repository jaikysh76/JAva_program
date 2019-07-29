package Java;

public class Dog 
{
	String name;
	String breed;
	int age;
	String color;
	//declare constroctor of a class
	public Dog(String name,String breed,int age,String color)
	{
		//construction decleration of class
		this.name=name;
		this.breed=breed;
		this.age=age;
		this.color=color;
		
	}
  //method are initialise
	//method 1
	public String getName()
	{
		return name;
	}
	//method 2
	public String getBreed()
	{
		return breed;
	}
	//method 3
	public int getAge() 
	{
		return age;
	}
	//method 4
	public String getColor()
	{
		return color;
	}
	public String toString() 
	{
		return("hi my name is " +this.getName()+ "\n my breed is " +this.getBreed()+  "\n my age is "+this.getAge()+ "\n my color is "+this.getColor() );
	}
	public static void main(String args[])
	{
		Dog tuffy =new Dog("Tuffy","papillion",5,"white");
		System.out.println(tuffy.toString());
	}
}
