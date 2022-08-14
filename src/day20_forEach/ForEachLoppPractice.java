package day20_forEach;

import java.util.Arrays;

public class ForEachLoppPractice {
    public static void main(String[] args) {

        int[] numbers ={1,2,3,4,5,6,7,8,9,10,11};

        for (int each:numbers
             ) {
            if (each%2==1){
                System.out.println(each);
            }
        }

        System.out.println("----------------------------------------");

        int [] nums = {100,20,30,40,5,4,3,2,1,5,1000,395,123};

        int max =nums[0];

        for (int each: nums
             ) {
            if (max<each){
                max=each;
            }
        }

        System.out.println("max = " + max);

        int[] a1={10,20,30,40,50};
        int[] a2={60,70,80,90,100,110,120};

        int[] a3= new int[a1.length+a2.length];
        int k=0;

        for (int each:a1
             ) {
            a3[k++]=each;

        }
        for (int each:a2
             ) {
            a3[k++]=each;
        }
        System.out.println(Arrays.toString(a3));

        System.out.println("-------------------------------------");

        String[] names= {"Mohammed Karimi", "Vasyl Dobrianski", "Gadir Ibrahimov", "Abidullah Rahimi"};

        for (String each:names
             ) {
            System.out.println(each.charAt(0)+"."+each.charAt(each.lastIndexOf(" ")+1));
        }







    }


}
