package basicjavapractice1;

import java.util.Scanner;

public class Oddeven {

    public static void main(String[] args){
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        num = sc.nextInt();


        if (num % 2 == 0){
            System.out.println("Its even number");
        }
        else {
            System.out.println("Its odd number");
        }
    }
}
