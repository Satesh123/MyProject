package basicjavapractice1;

import java.util.Scanner;

public class Cubeofthenumber {


    public static void main(String[] args){

        int j;
        int k;
        int cube;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        j = sc.nextInt();

        for (k=0; k<=j; k++){
            cube = (k*k*k);
            System.out.println("Cube of " + k + " is: " + cube);
        }


    }

}
