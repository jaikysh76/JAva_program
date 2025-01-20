import java.util.Scanner;

public class table
{
    public static void main(String args [])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println(" give table");
        int j= sc.nextInt();
        for (int i=1; i<=10;i++)
        {
            System.out.println(j*i);
        }
    }
}
