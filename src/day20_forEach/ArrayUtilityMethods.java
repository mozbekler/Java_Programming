package day20_forEach;

import java.util.Arrays;

public class ArrayUtilityMethods {

    public static void main(String[] args) {

        int [] score ={70,100,80,90,65};

        System.out.println(Arrays.toString(score));

    int[] a1={1,2,3,4,5};

    int[] a2={1,2,3,4,5};


       System.out.println(Arrays.equals(a1,a2));

       char[] ch1={'A','B','C'};
       char[] ch2={'A','C','B'};

       boolean r= Arrays.equals(ch1,ch2);
        System.out.println(r);

        int [] nums={100,80,45,12,54,645,12,0,76,45};

        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));
        System.out.println("Minimum number: "+ nums[0]);
        System.out.println("Maximum number: "+ nums[nums.length-1]);

        String[] students ={"Yasar", "Madiyar", "Ali", "Abdullah", "Alena"};

        System.out.println(Arrays.toString(students));

        Arrays.sort(students);

        System.out.println(Arrays.toString(students));

        int[] array = {10,20,30,40,50,60,70};

        int[] array2 = Arrays.copyOf(array,10);

        System.out.println(Arrays.toString(array2));

        int[] n1={1,2,3,4,5};
        int[] n2= {6,7,8,9,10,11};

        int[] n3=Arrays.copyOf(n1,n1.length+n2.length);

        for (int i = 0, j=n1.length; i < n2.length; i++,j++) {
            n3[j]=n2[i];
        }

        System.out.println(Arrays.toString(n3));

        char[] ch={'A', 'B','C','D','E','F','G'};

        char[] result1= Arrays.copyOfRange(ch,2,ch.length);

        System.out.println(Arrays.toString(result1));






    }
}
