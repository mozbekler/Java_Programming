package day06_ifStatements;

public class IdentifyNumberBoolean {

    public static void main(String[] args) {

        double number;

        number = -10;

        boolean isPositive = number>0; //if the number is greater than 0, then it is positive number
        boolean isNegative = number<0;
        //boolean isZero = number==0;

        boolean isZero =!isPositive && !isNegative; // if the number is not positive and not negative, means then it is zero




        System.out.println(number+ " is a positive number: "+ isPositive);
        System.out.println(number+ " is a negative number: "+ isNegative);
        System.out.println(number+ " is zero: "+ isZero);



    }
}
/*
Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

            Ex:
                number = 200

            output:
                200 is positive number: true
                200 is negative number: false
                200 is zero: false
 */