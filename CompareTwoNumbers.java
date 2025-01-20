import java.util.Scanner;

public class CompareTwoNumbers
{
    public static void main(String args[])
{
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter your first No and second number \t");
    int first = sc.nextInt();
    int second = sc.nextInt();

    if (first == second )
    {
        System.out.println("Equal");
    } else if (first >= second) {
        System.out.println("fist greater then second");
    } else
   {
       System.out.println("fist Smaller then second");
    }

}
}
