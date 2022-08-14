package day13_CustomMethods;

public class ReturnStatement {

    public static void main(String[] args) {

        eligible(44);



    }
    public static void eligible (int age){
        if (age<0 || age >150) {
            System.err.println("Invalid age: " + age);
            return;
            // if the age is invalid, then this gets terminated
        }

        if (age>=21){
            System.out.println("You are eligible to buy alcohol");
        }else {
            System.out.println("You are not eligible to buy alcohol");
        }
    }
}
