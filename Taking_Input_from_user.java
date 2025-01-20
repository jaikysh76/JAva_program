
import java.util.Scanner;

public class Taking_Input_from_user {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enetr value A: ");
        int a= sc.nextInt();
        System.out.println("Enetr value B: ");
        int b= sc.nextInt();

        int sum;
        sum = a+b;
        System.out.println(sum);
    }
}
