package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Cydeo School";

        char[] ch =str.replace(" ","").toCharArray();

        System.out.println(Arrays.toString(ch));

        String str2="         Today is a great day to learn java";

        String[] words=str2.trim().split(" ");

        System.out.println(Arrays.toString(words));

        String sentence= "I love Java";

        String reversed[]= sentence.split(" ");

        reversed= ArraysUtility.reverse(reversed);

        System.out.println(Arrays.toString(reversed));

        String reversedSentence="";

        for (int i = 0; i < reversed.length; i++) {
            reversedSentence+=reversed[i]+" ";
        }

        System.out.println(reversedSentence);
    }
}
