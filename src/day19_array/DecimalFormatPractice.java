package day19_array;

import java.text.DecimalFormat;

public class DecimalFormatPractice {

    public static void main(String[] args) {


        DecimalFormat df = new DecimalFormat("0.00000");

        double n1 = 10.58764542;

        System.out.println(df.format(n1));








    }
}
