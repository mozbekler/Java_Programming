package day13_CustomMethods;

public class ReturnMethodPractice {
    public static void main(String[] args) {

        System.out.println(isOdd(31));

        System.out.println(isEven(32));


        System.out.println(maxNum(45,87));

        System.out.println(minNum(45,87));




    }
    public static boolean isOdd(int num){

         return (num % 2 !=0)? true : false;

    }

    public static boolean isEven (int num){
        return !isOdd(num);
    }

    public static int maxNum(int n1, int n2){

        if (n1>=n2){
            return n1;
        }else {
            return n2;
        }


    }

    public static int minNum (int n1, int n2){

        if (maxNum(n1,n2)==n1){
            return n2;
        }else {
            return n1;
        }

    }
}
/*
Create a method named isOdd, that can return true if a number is an odd number

Create a method named isEven, that can return true if a number is an even number

Create a method named max, that can return the maximum number between two numbers

Create a method named min, that can return the minimum number between two numbers

 */
