package day21_multiDimensionalArray;

import java.util.Arrays;

public class RemoveExtraSpaces {

    public static void main(String[] args) {

        String str = "  Hello world      I      love      Java    ";
        str = str.trim();

        String[] arr= str.split(" ");

       str="";


        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i].isEmpty())){
                str+=arr[i]+" ";
            }
        }

        str=str.trim();

        System.out.println(str);









    }
}
/*
1. Write a program that can remove all the extra space from string
            Ex:
                str = "  Hello world      I      love      Java    "

            Output:
                Hello world I love Java
 */