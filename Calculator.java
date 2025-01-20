import java.util.Scanner;

public class Calculator {

    public static  void main(String args[]){


        System.out.println("Choose 1 --> Addition \t 2 ---> Subtraction \t 3 : Multiplication \t 4 : Divide");
        int n= sc.nextInt();
        if(n==1) {

            int num3 = num1 + num2;
            System.out.println("Addition \t" + num3);
        }else if(n==2) {
            int num4 = num1 - num2;
            System.out.println("Subtraction\t" + num4);
        }else if(n==3) {
            int num5 = num1 * num2;
            System.out.println("Multiplication \t" + num5);
        }else if(n==4) {
            int num6 = num1 % num2;
            System.out.println("Divide \t " + num6);
        }
        else
                System.out.println("END");


        }

    }
