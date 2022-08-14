package day25_constructors;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {

    public static void main(String[] args) {

        DateTimeFormatter df=DateTimeFormatter.ofPattern("MMMM-dd-yy");

        LocalDate today =LocalDate.now();

        System.out.println(today);
        System.out.println(today.format(df));

        LocalDate date1=LocalDate.of(2022,7,1);

        System.out.println(date1.format(df));






    }
}
