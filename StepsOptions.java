import java.sql.SQLOutput;
import java.util.Scanner;

public class StepsOptions {
    public static void main(String args[])
    {
        System.out.println(" please Choose 1 , 2 , 3");
        Scanner sc = new Scanner(System.in);
        int options =sc.nextInt();

           if (options ==1){
               System.out.println("First Floor");
           }
           else if(options==2){
        System.out.println("Second Floor");
    }
           else if(options==3){
        System.out.println("third Floor");
    }
           else{
               System.out.println("Invalid Button");
           }

    }
}
