package day09_Scanners;

 // regular import: imports the Scanner class

//import java.util.*;            // wild import: imports all classes inside the java.util

import java.util.Objects;
import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // for reading user inputs

        System.out.println("Enter your first number: ");

        byte num1= input.nextByte();

        System.out.println("Enter your second number: ");
        short num2= input.nextShort();

        System.out.println("Enter your third number");
        int num3 =input.nextInt();




        System.out.println("Enter your fourth number");

        int num4 = input.nextInt();

        input.close(); // scanner is closed, can not read user inputs again

        System.out.println("You first number: "+num1);
        System.out.println("Your second number: "+num2);
        System.out.println("Your third number: "+num3);
        System.out.println("Your fourth number: "+num4);













    }


}
