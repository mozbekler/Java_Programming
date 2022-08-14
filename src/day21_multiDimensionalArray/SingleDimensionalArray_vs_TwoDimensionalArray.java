package day21_multiDimensionalArray;

import java.util.Arrays;

public class SingleDimensionalArray_vs_TwoDimensionalArray {

    public static void main(String[] args) {

        int[] arr1D= new int[10];

        int [] [] arr2D =new int[5][10];

        System.out.println(Arrays.deepToString(arr2D));

        for (int i = 0; i < arr2D.length; i++) {
            arr2D[i]=arr1D;

            for (int j = 0; j < arr1D.length; j++) {
              arr1D[j]=2*j+2;
            }
        }

        System.out.println(Arrays.deepToString(arr2D));
        
    }
}
