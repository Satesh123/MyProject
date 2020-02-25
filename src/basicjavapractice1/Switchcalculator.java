package basicjavapractice1;

import java.util.Scanner;

public class Switchcalculator {

    public static void main(String[] args){

        int a, b;
        int result=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        b = sc.nextInt();
        System.out.println("Enter an operator (+,-,*,/): ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                result = a+b;
                break;
            case '-':
                result = a-b;
                break;
            case '*':
                result = a*b;
                break;
            case '/':
                result = a/b;
                break;
            default:
                System.out.println("You enter wrong operator");
                break;
        }
        System.out.println(a +" " + operator+ " " + b +"= " + result);
    }
}
