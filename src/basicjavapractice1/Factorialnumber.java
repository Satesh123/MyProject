package basicjavapractice1;

import java.util.Scanner;

public class Factorialnumber {

    public static void main(String[] args){

        int num=1;
        int factorial = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();

        for(int i=1; i<=num; i++){

            factorial = factorial*i;
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
