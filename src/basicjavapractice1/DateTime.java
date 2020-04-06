package basicjavapractice1;

import java.util.Calendar;

public class DateTime {
    public static void main(String[] args) {
        int Year = 2020;
        int Month = 2;
        int date = 20;

        Calendar cal = Calendar.getInstance();
        cal.clear();
        System.out.println();
        cal.set(Calendar.YEAR, Year);
        cal.set(Calendar.MONTH, Month);
        cal.set(Calendar.DATE, date);

        System.out.println(cal.getTime());
        System.out.println();
    }
}
