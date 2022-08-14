package day25_constructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LunchTasks {

    public static void main(String[] args) {

        DateTimeFormatter df =DateTimeFormatter.ofPattern("EEEE, h:mm a, MMM/dd/y");
        LocalDateTime dateTime =LocalDateTime.of(2020,11,24,13,00);

        System.out.println(dateTime.format(df));

        String[] classmates=new String[5];

        classmates[0]="Sumeye";
        classmates[1]="Glen";
        classmates[2]="Yulia";
        classmates[3]="Sebastian";
        classmates[4]="Yusuf";







    }
}
/*
Task01. use the LocalDateTime get the date and time in the following format:
            Tuesday, 1:00 pm, Nov/24/2020
Task02:
    1. create string array to have 5 of your classmate's names

    2. create an array that contains their date of birth

    3. find out who is the youngest person

    4. find out who was born on leap year
 */