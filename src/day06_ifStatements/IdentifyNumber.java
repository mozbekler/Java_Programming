package day06_ifStatements;

public class IdentifyNumber {

    public static void main(String[] args) {

        double number;

        number = -100;

        if (number>0){
            System.out.println(number+" is a positive number: true \n"+number+" is a negative number: false \n" +number + " is zero: false" );}

        if (number==0){
            System.out.println(number+" is a positive number: false \n"+number+" is a negative number: false \n" +number + " is zero: true" );}

        if (number<0){
            System.out.println(number+" is a positive number: false \n"+number+" is a negative number: true \n" +number + " is zero: false" );}

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