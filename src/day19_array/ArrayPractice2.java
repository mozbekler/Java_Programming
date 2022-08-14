package day19_array;

import java.util.Arrays;

public class ArrayPractice2 {

    public static void main(String[] args) {

        int numbers[]=new int[100];

        for (int i = 0; i < 100; i++) {
            numbers[i]=i+1;
        }

        System.out.println(Arrays.toString(numbers));



        for (int i = numbers.length - 1, j=1; i >= 0; i--, j++) {

            numbers[i]=j;
        }



        for (int i = 0; i < 100; i++) {

            numbers[i]=100-i;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
