package day11_Strings2;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter word1: ");


        String word1 =input.next();

        System.out.println("Please enter word 2: ");

        String word2 = input.next();

        int w1= word1.length();
        int w2 =word2.length();

        if (w1>w2){
            System.out.println("Longest word is: "+word1);
        } else if (w2>w1) {
            System.out.println("Longest word is: "+word2);
            } else{
            System.out.println("Both words are in equal length");
                    }

input.close();
    }
}
/*

 1.1 Ask the user to enter two strings
 1.2 Write a program that can print the longest string, if both have the same number of characters then print "Equal"
 */