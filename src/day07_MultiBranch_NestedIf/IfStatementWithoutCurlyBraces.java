package day07_MultiBranch_NestedIf;

import java.sql.SQLOutput;

public class IfStatementWithoutCurlyBraces {

    public static void main(String[] args) {


        int age = 32;

        if (age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }

        System.out.println("-----------------------------------------------");

        if (age >= 21)
            System.out.println("Eligible");
         else
            System.out.println("Not eligible");

        System.out.println("-----------------------------------------------");




    }
}