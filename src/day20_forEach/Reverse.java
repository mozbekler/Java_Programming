package day20_forEach;

import org.w3c.dom.ls.LSOutput;
import utilities.ArraysUtility;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};

        int [] reverse =new int[array.length];

        for (int i = array.length-1, j=0; i >=0 ; i--, j++) {
            reverse[j]=array[i];
        }


        System.out.println(Arrays.toString(reverse));

        int[] nums={100,200,300,400,500};

        nums = ArraysUtility.reverse(nums);

        System.out.println(Arrays.toString(nums));

        char[] ch = {'a','b','c'};

        ch= ArraysUtility.reverse(ch);

        System.out.println(Arrays.toString(ch));


    }




}
