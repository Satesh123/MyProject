package basicjavapractice1;

import java.util.Scanner;

public class Compare {

    public static void main(String[] args) {

        int marks;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks");
        marks = sc.nextInt();

        if (marks > 40 && marks < 50) {
            System.out.println("You passed with Third class");
        } else if (marks > 50 && marks < 60) {
            System.out.println("You passed with Second class");
        } else if (marks > 60) {
            System.out.println("You Passed with First Class");
        } else {
            System.out.println("You Failed");
        }
    }
}
