package day16_nestedLoop;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer="yes";

        while(answer.equals("yes")) {
            System.out.println("Enter a number");
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }

            System.out.println("Would you like to enter another number? Yes/No");
           answer = input.next().toLowerCase();

            while(!(answer.equals("yes") || answer.equals("no"))){
                System.err.println("Invalid entry! Would you like to enter another number? Yes/No");
                answer = input.next().toLowerCase();
            }
            if(answer.equals("no")){
                break;
            }

        }


    }
}
