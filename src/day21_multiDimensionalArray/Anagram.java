package day21_multiDimensionalArray;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean isAnagram=Arrays.equals(arr1,arr2);

        System.out.println("isAnagram = " + isAnagram);





    }
}
/*
. Write a  function that check if a string is build out of the same letters as another string. (Anagram Task)

            Ex: str1 = "heart"
                str2 = "earth"

            output:
                true

                str1 = "java"
                str2 = "python"
            output:
                false
 */