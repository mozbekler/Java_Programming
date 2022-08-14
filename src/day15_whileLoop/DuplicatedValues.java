package day15_whileLoop;

import java.util.Scanner;

public class DuplicatedValues {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a string value:");

        String str = input.next();
        String result="";

        for (int i = 0; i < str.length() ; i++) {

            char each = str.charAt(i);

            if (!result.contains(""+ each)) {
                result += each;
            }

        }

        System.out.println(result);

    }
}
/*
3. Write a program that can remove the duplicated characters from the a string

                Ex:
                    str = "aabbbcccc"

                    output:
                        abc
 */