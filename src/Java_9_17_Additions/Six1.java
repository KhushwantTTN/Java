package Java_9_17_Additions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Six1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the date(YYYY-MM-DD)");
        String date = sc.next();
        LocalDate date1 = LocalDate.parse(date);

        System.out.println("Enter the Second date(YYYY-MM-DD)");
        String date_2 = sc.next();
        LocalDate date2 = LocalDate.parse(date_2);

        if(date1.isBefore(date2))
            System.out.println(date1 + " occur before " + date2);

        else if (date1.isAfter(date2))
            System.out.println(date1 + " occur after " + date2);

        else System.out.println("Both are same");

    }
}
