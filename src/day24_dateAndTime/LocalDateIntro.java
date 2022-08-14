package day24_dateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println(today);

        LocalDate birthDay = LocalDate.of(1984,11,9);

        System.out.println(birthDay);
        System.out.println("--------------------------------");

        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getMonthValue());
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfYear());
        System.out.println(birthDay.getDayOfWeek());

        System.out.println("---------------------------------------------------");

        LocalDate newDate=today.plusYears(1);

        System.out.println(today);
        System.out.println(newDate);

        System.out.println("---------------------------------------------------");

        LocalDate graduationDate = LocalDate.of(2025,6,4);

        System.out.println(graduationDate);

        graduationDate=graduationDate.plusYears(2);

        System.out.println(graduationDate);

        graduationDate=graduationDate.plusMonths(7);

        System.out.println(graduationDate);

        graduationDate=graduationDate.plusWeeks(7);

        System.out.println(graduationDate);

        graduationDate=graduationDate.plusDays(100);

        System.out.println(graduationDate);

        System.out.println("---------------------------------------------------");

        LocalDate yourBirthday = LocalDate.of(2005,4,1);

        LocalDate hisBirthday = yourBirthday.minusYears(2).minusMonths(3).minusDays(10);

        System.out.println("yourBirthday = " + yourBirthday);
        System.out.println("hisBirthday = " + hisBirthday);
        System.out.println("---------------------------------------------------");


        LocalDate date1=LocalDate.of(1994,7,7);
        LocalDate date2= LocalDate.of(1995,6,7);

        System.out.println(date1.isEqual(date2));
        System.out.println(date1.isAfter(date2));
        System.out.println(date1.isBefore(date2));

        LocalDate startDate=LocalDate.of(2022,04,19);

        LocalDate grad_date=startDate.plusMonths(9);

        System.out.println("grad_date = " + grad_date);

        System.out.println(today.isLeapYear());



    }
}
