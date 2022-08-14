package day15_whileLoop;

import java.util.Scanner;

public class maxOfFiveNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max=-2147483648;
        int num=0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter a number:");
            num= input.nextInt();
            if(num>max){
                max=num;

            }
        }


        System.out.println("max = " + max);
    }
}
