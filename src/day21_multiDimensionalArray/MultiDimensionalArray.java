package day21_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        int[] [] arr2D1={{1,2},{3,4,5}};
        int[] [] arr2D2 ={{6,7,8,9},{10,11},{12,13,14}};
        int[] [] arr2D3 ={{15,16,17,18}};

        int[] [] [] arr3D={arr2D1,arr2D2,arr2D3};

        // [index of 2D array] [index of 1D array] [index of elements]
        System.out.println(arr3D[2][0][2]);
        System.out.println(arr3D[1][1][0]);
        System.out.println(Arrays.toString(arr3D[1][1]));
        System.out.println(Arrays.deepToString(arr3D[1]));

        System.out.println(Arrays.deepToString(arr3D));
        System.out.println("------------------------------------------");

        for (int i = 0; i < arr3D.length; i++) {
            int [][] each2D= arr3D[i];
            System.out.println(Arrays.deepToString(each2D));

            for (int j = 0; j < each2D.length; j++) {
                int[] each1D = each2D[j];
                System.out.println(Arrays.toString(each1D));

                for (int k = 0; k < each1D.length; k++) {
                    int eachElement = each1D[k];
                    System.out.println(eachElement);
                }
            }
        }

        }




    }

