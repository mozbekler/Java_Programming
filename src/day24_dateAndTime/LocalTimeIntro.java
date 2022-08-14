package day24_dateAndTime;

import java.time.LocalTime;

public class LocalTimeIntro {

    public static void main(String[] args) {
        LocalTime starting_time=LocalTime.of(10,30);

        System.out.println(starting_time.plusHours(1).plusMinutes(13).plusSeconds(22).plusNanos(4600000));

        LocalTime right_now=  LocalTime.now();

        System.out.println(right_now);



    }




}
