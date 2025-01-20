import java.util.Scanner;

public class StepSwitch {
    public static void main(String args[]){
        System.out.println("Welcome to our Lift");
        System.out.println("select b/w 1 --> 3");
        Scanner sc= new Scanner(System.in);
        int option= sc.nextInt();
        switch (option){
            case 1:
                System.out.println("1st floor");
                break;
            case 2:
                System.out.println("2nd floor");
                break;
            case 3:
                System.out.println("3rd Floor");
            default:
                System.out.println("Invalid Number");
                System.out.println("visit Again");
        }

    }
}
