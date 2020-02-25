package basicjavapractice1;

import java.util.Scanner;

public class Sumofnaturalnumber {

    public static void main(String[] args){

        int num=0;
        int sum=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        num = sc.nextInt();

        for (int a=0; a<=num; a++ ) {

            sum += a;
        }
            System.out.println("Sum of natural number is: " + sum);

    }
}
