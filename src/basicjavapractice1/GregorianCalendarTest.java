package basicjavapractice1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarTest {
    public static void main(String[] args){

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov","Dec"};

        int year;

        // Create a Gregorian calendar initialized
        // with the current date and time in the
        // default locale and timezone.

        GregorianCalendar gCalender = new GregorianCalendar();

        //Display current date and time information.

        System.out.print("Date:  ");
        System.out.print(months[gCalender.get(Calendar.MONTH)]);
        System.out.print(" " + gCalender.get(Calendar.DAY_OF_MONTH) + " ");
        System.out.println(year = gCalender.get(Calendar.YEAR));
        System.out.print("Time: ");
        System.out.print(gCalender.get(Calendar.HOUR) + ":");
        System.out.print(gCalender.get(Calendar.MINUTE) + ":");
        System.out.println(gCalender.get(Calendar.SECOND) + " ");

        // Test if a current year is a leap year

        if(gCalender.isLeapYear(year)){
            System.out.println("The current year is a leap year");
        }else {
            System.out.println("The current year is not a leap year");
        }
    }
}
