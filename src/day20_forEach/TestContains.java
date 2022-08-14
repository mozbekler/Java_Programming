package day20_forEach;

import utilities.ArraysUtility;

public class TestContains {

    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};

        System.out.println(ArraysUtility.contains(numbers,2));
        System.out.println(ArraysUtility.contains(numbers,6));



        String[]str= {"Yasin","Yasin", "Ali", "Reza", "Muktar", "Mohammad"};        System.out.println(ArraysUtility.contains(str, "Yasin"));

    }





}
