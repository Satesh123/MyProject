package basicjavapractice1;

import java.util.Scanner;

public class Switchstatment {


    public static void main(String[] args) {

        int marks;
        String grade;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks");
        marks = sc.nextInt();

        if (marks > 40 && marks < 50) {
            grade = "Third Class";
        } else if (marks > 50 && marks < 60) {
            grade = "Second Class";
        } else if (marks > 60) {
            grade = "First Class";
        } else {
            grade = "Faild";
        }

        switch (grade){
            case "Third Class":
                System.out.println("Passed with" + grade);
                break;
            case "Second Class":
                System.out.println("Passed with" + grade);
                break;
            case "First Class":
                System.out.println("Passed with" + grade);
                break;
            default:
                System.out.println("Faild");

        }
    }
}
