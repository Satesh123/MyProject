package basicjavapractice1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Greatestnum {

    public static void main(String[] args){
        int a,b,c;

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter value a:");
            a = sc.nextInt();
            System.out.println("Enter value b:");
            b = sc.nextInt();
            System.out.println("Enter value c:");
            c = sc.nextInt();

            if (a > b && a > c) {
                System.out.println(" A is bigger number");
            } else if (b > a && b > c) {
                System.out.println("B is bigger number");
            } else
                System.out.println("C is biggest number");
        } catch (Exception i) {
            if(i instanceof InputMismatchException) {
                System.out.println("OOps!! Please enter valid integer input!!");
            } else {
                System.out.println("Invalid input");
            }
        }




    }
}
