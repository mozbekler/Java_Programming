package utilities;

import java.util.Arrays;

public class IteratingMultiDimensionalArrays {

    public static void main(String[] args) {

        int[] arr1={10,20,30};
        int[] arr2={40,50,60,70,80};
        int[] arr3={90,100};

        int [] [] array2D = {arr1,arr2,arr3};

        for (int i = 0; i < array2D.length; i++) {

            int [] each1D = array2D[i];


            for (int i1 = 0; i1 < each1D.length; i1++) {

                int eachElement = each1D[i1];
                System.out.println(eachElement);

            }
        }

        System.out.println("---------------------------------------------");

        for (int[] each1DArray:array2D
             ) {
            System.out.println(Arrays.toString(each1DArray));
            for (int eachElement:each1DArray
                 ) {
                System.out.println(eachElement);
            }
        }


    }
}
