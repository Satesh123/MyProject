package basicjavapractice1;

import java.util.Date;

public class CurrentDate {

    public static void main(String[] args){

        Date date = new Date();

        System.out.println(date.toString()); // Get current date and time.

        String str = String.format("Current Date/Time : %tc", date); // Format current date and time.
        System.out.println(str);

        System.out.printf("%1$s %2$tB %2$td, %2$tY","Date: ", date); // Using printf
    }
}
