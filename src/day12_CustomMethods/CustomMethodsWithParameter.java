package day12_CustomMethods;

public class CustomMethodsWithParameter {

    public static void main(String[] args) {

        displayValue(5,"five");

        oddOrEven(6789);

        oddOrEven(1084021);

        oddOrEven(123456789);

    }

    public static void displayValue(int num, String word) {

        System.out.println("The number is " + num +" (" + word+")");
    }
// the method takes an argument, and verifies if the number is odd or even number
    public static void oddOrEven(int num){

        if (num%2==0){
            System.out.println(num+ " is an even number");
        }else {
            System.out.println(num+ " is an odd number");
        }



    }

}


