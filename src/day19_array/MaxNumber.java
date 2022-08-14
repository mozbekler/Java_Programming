package day19_array;

public class MaxNumber {

    public static void main(String[] args) {

       int[] numbers = {100,50,20,500,-40,30};

       int max = numbers[0];

        for (int i = 1; i < numbers.length ; i++) {
            if (numbers[i]>max){
                max=numbers[i];
            }
        }

        System.out.println("max = " + max);















    }
}
