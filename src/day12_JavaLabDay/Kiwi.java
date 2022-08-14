package day12_JavaLabDay;

import java.util.Scanner;

public class Kiwi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your departure point?");
        String departure = input.next();
        System.out.println("What is your destination?");
        String destination = input.next();
        System.out.println("I have bags. (true/false)");
        boolean hasBags = input.nextBoolean();
        System.out.println("I only prefer non-stop transport options (true/false)");
        boolean isNonStop = input.nextBoolean();
        System.out.println("Which transportation type do you prefer? (train/bus/flight)");
        String transportType = input.next();

        if (transportType.equalsIgnoreCase("train") && !hasBags && isNonStop){
            System.out.println("Train: TR001 Boarding Time: 07:15 AM" );
            }
        if (transportType.equalsIgnoreCase("train") && !hasBags && !isNonStop){
            System.out.println("Train: TR002 Boarding Time: 09:30 AM" );
        }
        if (transportType.equalsIgnoreCase("train") && hasBags && isNonStop){
            System.out.println("Train: TR003 Boarding Time: 08:24 AM" );
        }
        if (transportType.equalsIgnoreCase("train") && hasBags && !isNonStop){
            System.out.println("Train: TR004 Boarding Time: 01:30 PM" );
        }
        if (transportType.equalsIgnoreCase("bus") && hasBags && isNonStop){
            System.out.println("Bus: BS001 Boarding Time: 07:00 AM" );
        }
        if (transportType.equalsIgnoreCase("bus") && hasBags && isNonStop){
            System.out.println("Bus: BS002 Boarding Time: 06:15 PM" );
        }
        if (transportType.equalsIgnoreCase("bus") && hasBags && isNonStop){
            System.out.println("Bus: BS003 Boarding Time: 10:30 PM" );

        }
        if (transportType.equalsIgnoreCase("flight") && hasBags && !isNonStop){
            System.out.println("Flight: FL001 Boarding Time: 05:45 AM" );
        }
        if (transportType.equalsIgnoreCase("flight") && !hasBags && isNonStop){
            System.out.println("Flight: FL002 Boarding Time: 09:35 AM" );
        }
        if (transportType.equalsIgnoreCase("flight") && !hasBags && !isNonStop){
            System.out.println("Flight: FL003 Boarding Time: 02:45 PM" );
        }

    }
}

