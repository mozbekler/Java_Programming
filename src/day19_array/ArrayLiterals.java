package day19_array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLiterals {

    public static void main(String[] args) {

        String[] days ={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int n=1;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of day");
        n= input.nextInt();
        System.out.println(days[n-1]);


        String [] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep","Oct", "Nov", "Dec" };
        System.out.println("Please enter the number of the month");
        n= input.nextInt();
        System.out.println(months[n-1]);

        int nums[]= new int[100];

        for (int i = 0; i < nums.length; i++) {
            nums[i]= i+1;
        }

        System.out.println(Arrays.toString(nums));

        for (int i = months.length - 1; i >= 0; i--) {
            System.out.println(months[i]);
        }








    }
}
