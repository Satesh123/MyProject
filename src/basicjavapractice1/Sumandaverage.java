package basicjavapractice1;

import java.util.Scanner;

public class Sumandaverage {

    public static void main(String[] args){
        int a=0, b=0, c=0;
        int average;

        {
            System.out.println("Enter any 5 Numbers: ");
        }
        for (a=0; a<5; a++){
            Scanner add = new Scanner(System.in);
            b = add.nextInt();
            c += b;

        }
        average =  c /5;
        System.out.println("Total of 5 no is: " + c + "\nThe average is: " + average);


    }
}
