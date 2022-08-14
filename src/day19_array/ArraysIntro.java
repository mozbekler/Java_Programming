package day19_array;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        int scores[] = new int[5];
        scores[2] = 78;
        scores[0] = 84;


        for (int i = 0; i < 5; i++) {
            scores[i] = 2 * i + 1;
            System.out.println(scores[i]);
        }


        System.out.println(Arrays.toString(scores));

        System.out.println(scores[2]);


        String items[] = new String[5];

        for (int i = 0; i < 5; i++) {
            items[i] = "item " + (i + 1);


        }System.out.println(Arrays.toString(items));
    }
}
