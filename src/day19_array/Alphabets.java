package day19_array;

import java.util.Arrays;

public class Alphabets {

    public static void main(String[] args) {

        char[] ascending = new char[26];
        char[] descending = new char[26];

        for (int i = 0, j='A', k='Z'; i < ascending.length; i++, j++, k--) {
            ascending[i]=(char) j;
            descending[i] = (char) k;
        }

        System.out.println(Arrays.toString(ascending));
        System.out.println(Arrays.toString(descending));

        char [] characters = new char[65535];

        for (int i = 0; i < characters.length; i++) {
            characters[i]= (char) i;
        }


        //System.out.println(Arrays.toString(characters));

        System.out.println(characters[76]);









    }
}
/*
1. Create a char array and store all the alphabet letters in ascending order

2. Create a char array and store all the alphabet letters in descending order
 */