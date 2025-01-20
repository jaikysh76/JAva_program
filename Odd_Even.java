import java.util.Scanner;

public class Odd_Even {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number");
        int number= sc.nextInt();
       int  no =number % 2;
        if(no == 0)
        {
            System.out.println("Even");
        }
        else {
            System.out.println("odd");
        }
    }
}
