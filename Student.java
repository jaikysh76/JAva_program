package _pasted_code_;

public class Student
{
	public static void main(String args[])
	{
		int student,marks,tot=0,dept;
		int arr [][][]= {{{50,60,55},{50,51,52}},
				         {{60,61,62},{63,64,65}},
				         {{65,70,75},{70,71,72}}};
		for(dept=0;dept<3;dept++)
		{
			System.out.print("Departmnt  " +(dept+1)+ " :");
			for(student=0;student<2;student++)
			{
				System.out.print("Student  " +(student+1)+ "marks:");
				for(marks=0;marks<3;marks++)
					{
					System.out.print(arr[dept][student][marks]+ " ");
					tot += arr[dept][student][marks];
					}
				System.out.println("Total: " +tot);
				tot=0;
			}
			System.out.println(" ");
			
		}
		
		
	}
}
