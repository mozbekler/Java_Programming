package day12_JavaLabDay;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter whether the bill is split or No Split: Yes/No");

        String split = input.next();

        System.out.println("Enter the number of people:");

        int numOfPeople = input.nextInt();

        System.out.println("Enter the check amount:");

        double checkAmount = input.nextDouble();

        System.out.println("How was the service quality? (Poor / Fair / Good / Great / Excellent");

        String serviceQuality = input.next();

        double tipRate=0;

        if (serviceQuality.equalsIgnoreCase("poor")){
            tipRate=0.05;
        } else if (serviceQuality.equalsIgnoreCase("fair")) {
            tipRate=0.1;
        } else if (serviceQuality.equalsIgnoreCase("good")) {
            tipRate=0.15;
        } else if (serviceQuality.equalsIgnoreCase("great")) {
            tipRate=0.20;
        } else if (serviceQuality.equalsIgnoreCase("excellent")) {
            tipRate=0.25;
        }else {
            System.out.println("Invalid value for service quality");
        }

        double totalTip = tipRate*checkAmount;

        System.out.println("Number of the people entered: "+ numOfPeople);

        System.out.println("Total to pay: "+ checkAmount);

        System.out.println("Total tip: "+ totalTip);

        if (split.equalsIgnoreCase("yes")){
            System.out.println("Total per person: " + (checkAmount/numOfPeople));

            System.out.println("Tip per person: "+ (totalTip/numOfPeople));
        } else {
            System.out.println("Total per person: " + (checkAmount));

            System.out.println("Tip per person: "+ (totalTip));
        }










        input.close();
    }
}
/*
1. Create a class called TipCalculator, and write a program for a tip calculator.
    There will be different service quality benchmarks that will determine the tip given.
    There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

    The program should ask the user to enter:
            - Split or No split (Yes or No),
             - Enter the number of people (number)
             - Enter the check amount (number)
             - Service Quality (String)

    And then it should display:
             Number of people entered
             Total to pay
             Total tip
             Total per person
             Tip per person:

    Ex:
        Split or No split (Yes or No)?
        YeS
        Enter the number of people
        4
        Enter the check amount:
        476
        How was the srvice quality? (Excellent/Great/Good/Fair/Poor)
        ExCElLeNt

        output:
            Number of people entered: 4
            Total to pay: 595.0
            Total tip: 119.0
            Total per person: 148.75
            Tip per person: 29.75

 */