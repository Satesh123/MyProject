package basicjavapractice1;

import java.util.Scanner;

public class Oddnumbersum {

    public static void main(String[] args){

        int a, b;
        int odd=0;
        int sum=0;
        {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter number: ");
          a = sc.nextInt();
          System.out.println("Input number is: " + a);

        for (b=1; b<=a; b++) {
            odd = 2 * b - 1;
            System.out.println( odd);
            sum += odd;
        }
            System.out.println("Odd number sum is: " + sum);


        }

    }
}
