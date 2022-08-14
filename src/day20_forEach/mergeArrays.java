package day20_forEach;

import java.util.Arrays;
import utilities.ArraysUtility;

public class mergeArrays {

    public static void main(String[] args) {

        int[] arr1= {1,2,3,4};
        int [] arr2 = {5,6,7,8};

        int [] arr3= new int [arr1.length+arr2.length];

        for (int i = 0; i < arr3.length; i++) {
            if (i< arr1.length){
                arr3[i]=arr1[i];
            }
            if (i>= arr1.length){
                arr3[i]=arr2[i- arr1.length];
            }

        }

        System.out.println(Arrays.toString(arr3));

        double[] a1={10.2,20.4,30,40,50,60};
        double[] a2={70,80,90};

        double[] a3 = ArraysUtility.merge(a1,a2);
        System.out.println(Arrays.toString(a3));


        char[ ] c1= {'a','b', 'c'};
        char[] c2 = {'d', 'e'};

        char[] c3 = ArraysUtility.merge(c1,c2);

        System.out.println(Arrays.toString(c3));

        String[] s1= {"ahmet","mehmet","veli"};
        String[] s2 = {"sebiha", "Binnur"};

        String[] s3 = ArraysUtility.merge(s1,s2);

        System.out.println(Arrays.toString(s3));




    }
}
/*
2. write a program that can merge two arrays of integers
        Ex:
            arr1 = {1,2,3,4}
            arr2 = {5,6}

        output
            arr3 = {1,2,3,4,5,6}
 */