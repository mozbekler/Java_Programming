package day22_arrayList;

public class MaxMinNumbersOfMutiDArray {

    public static void main(String[] args) {

        int [] [] array= {{100,20,300},{10,1000,50},{-200,0,400}};

        int max=-2147483648;

        for (int i = 0; i < array.length; i++) {
            int[] arr1D = array[i];

            for (int j = 0;  j< arr1D.length; j++) {
                int num= arr1D[j];

                if(num>max){
                    max=num;
                }
            }
        }

        System.out.println("max = " + max);

        int min=2147483647;

        for (int i = 0; i < array.length; i++) {
            int[] arr1D = array[i];
            for (int j = 0;  j< arr1D.length; j++) {
                int num= arr1D[j];

                if(num<min){
                    min=num;
                }
            }
        }
        System.out.println("min = " + min);


    }
}
/*
2. Write a program that can find the minimum and maximum numbers from a two dimensional array of integers
        Ex:
            array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };

            output:
                Minimum number is: -200
                Maximum number is: 1000
You do not have permission to send messages in this channel.

 */