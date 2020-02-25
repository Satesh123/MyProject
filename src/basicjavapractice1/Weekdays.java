package basicjavapractice1;

import java.util.Scanner;

public class Weekdays {

    public static void main(String[] args){

        int num;
        String day;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        num = sc.nextInt();

        switch (num){
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Oops! wrong input ";
                break;
        }

        System.out.println("Day is: " + day);
    }
}
