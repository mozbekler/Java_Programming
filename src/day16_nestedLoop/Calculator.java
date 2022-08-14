package day16_nestedLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String answer = "yes";

        while (answer.equals("yes")){
            System.out.println("Please enter your first number");
            double num1= input.nextDouble();
            System.out.println("Please enter a math operator");
            char operator = input.next().charAt(0);

            while(!(operator=='+'|| operator=='-' || operator=='*' || operator =='/')){
                System.err.println("Invalid operator! Please re-enter the math operator");
                operator=input.next().charAt(0);
            }

            System.out.println("Please enter your second number");
            double num2= input.nextDouble();

            double result= (operator=='+')? num1+num2 :(operator=='-')? num1-num2 : (operator=='*') ? num1*num2 : num1/num2;
            System.out.println("result = " + result);

            System.out.println("Would you like to continue?");
            answer= input.next().toLowerCase();

            while (! ((answer.equals("yes"))|| answer.equals("no")) ){
                System.err.println("Invalid answer Would you like to continue. Yes/No");
                answer= input.next().toLowerCase();
            }
        }






    }







}
/*
1. Write a program for a simple calculator
            1.1 ask the user to enter first number: (double)
            1.2 ask the user to enter a math operator: (-, +, *, /)
                if the user enters invalid math operator, reapet the same step until user enters a valid operator

            1.3 ask the to enter the second number: (double)
            1.4 display the calculation result
            1.5 Would you like to continue? (Yes/No)
 */