package day13_CustomMethods;

public class ReturnMethodIntro {
    public static void main(String[] args) {

        //int total = sum(20,40); // sum is a void method, it does not return any data

        int total = addition(34,25);

        System.out.println(total);

        int total2 = addition(-10,10);

        System.out.println(total2);

        System.out.println(square(total));

        System.out.println(square(0.5));

        System.out.println(cube(-2));


    }
/*
    public static void sum(int n1, int n2){
        int result = n1 + n2;



    }*/

    public static int addition (int n1,int n2){
        int result = n1+ n2;


        return result;
    }

    public static double square (double num){

        double result = num*num;

        return result;

    }

    public static double cube(double num){
        double cube = square(num)*num;
        return cube;

    }
}
