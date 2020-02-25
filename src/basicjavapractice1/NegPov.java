package basicjavapractice1;

import java.util.Scanner;

public class NegPov {

    public static void main(String[] args){

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        num = sc.nextInt();

        if (num > 0){
            System.out.println("It's a positive number");
        }
        else {
            System.out.println("It's a negative number");
        }

    }

}
