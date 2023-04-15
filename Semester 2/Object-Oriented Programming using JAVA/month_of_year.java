// Write a program to display the month of a year. Months of the year should be held in an array.

import java.util.Calendar;

public class month_of_year {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("The current date is " + (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.DATE) + "-"
                + cal.get(Calendar.YEAR));
        String[] months = new String[] {
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        };
        System.out.println("Current month is: " + months[cal.get(Calendar.MONTH)]);
    }
}
