package day09_Scanners;

import java.util.Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the day number: ");

        int num = input.nextInt();


        String day = (num==1)? "Monday" :(num==2)? "Tuesday" :(num==3)? "Wednesday" :(num==4)? "Thursday" :(num==5)? "Friday" :(num==6)? "Saturday" :(num==7)? "Sunday" : "Invalid";

        System.out.println("day = " + day);



        input.close();

    }
}
