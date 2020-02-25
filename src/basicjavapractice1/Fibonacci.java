package basicjavapractice1;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args){

        int oldnum = 0;
        int newnum = 1;
        int n;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers you wants to print: ");
        n = sc.nextInt();
        System.out.println("Your "+n+ " Fib numbers are: ");

        for(int i=0; i<=n; i++){

            sum = oldnum + newnum;
            oldnum = newnum;
            newnum = sum;

            System.out.println( sum);

        }

    }
}
