package day11_Strings2;

import java.util.Scanner;

public class DigitalLetterSpecialChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word: ");

        String word = input.next();

        if (word.length() >= 1){
            if (word.charAt(0)>=48 && word.charAt(0)<=57){
                System.out.println("first character is a digit");
            } else if (word.charAt(0)>=65 && word.charAt(0)<=90) {
                System.out.println("first character is an uppercase letter");
            } else if (word.charAt(0)>=97 && word.charAt(0)<=102) {
                System.out.println("first character is a lowercase letter");
            } else {
                System.out.println("first character is a special character");
            }
        }else{
            System.out.println("String is empty");
        }




    }
}
/*
Write a program that can ask the user to enter a word
            - if the word starts with digits, print "first character is digit"
            - if the word starts with uppercase letters, print "first character is lowercase letter"
            - if the word starts with lowercase letters, print "first character is uppercase letter"
            - if the word starts with special characters, print "first character is special character"
 */