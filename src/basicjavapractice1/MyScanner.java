package basicjavapractice1;

import java.util.Scanner; //Import the scanner class

public class MyScanner {
    public static void main(String [] args){
        Scanner myobj = new Scanner(System.in);


        System.out.println("Enter Username:");
        String userName = myobj.nextLine();
        System.out.println("User name is: " + userName);

        System.out.println("Enter Password:");
        String Password = myobj.nextLine();
        System.out.println("Password is: " + Password);

        System.out.println("Enter Address:");
        String Address = myobj.nextLine();
        System.out.println("Address is: " + Address);

        System.out.println("Enter age:");
        int age = myobj.nextInt();
        System.out.println("Age is: " + age);


        System.out.println("Enter PhNumber:");
        long PhNumber = myobj.nextLong();
        System.out.println("PhNumber is: " + PhNumber);



    }
}
