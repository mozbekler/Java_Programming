package day12_CustomMethods;

public class CustomMethodPractice2 {
    public static void main(String[] args) {

        maxNum(123154,5645);

        maxNum(15.3, 56.8);

        maxNum(14.4, 14.4);



    }
    //create a method that can print the maximum number, if equal print equal
    public static void maxNum (double num1, double num2) {
        if(num1>num2){
            System.out.println(num1+ " is the maximum number");
        } else if (num2>num1) {
            System.out.println(num2+ " is the maximum number");
        }else {
            System.out.println("equal");
        }
    }




}
