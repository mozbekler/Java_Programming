package day12_CustomMethods;

public class CustomMethodPractice {
    public static void main(String[] args) {

        eligibleForAlcohol(2);

        oddEvenZero(-4);

        grade(46);

    }

    public static void eligibleForAlcohol(int age) {

        if (age >= 21) {
            System.out.println("Eligible to buy alcohol");
        } else {
            System.out.println("Not eligible to buy alcohol");
        }
    }

    public static void oddEvenZero(int num){

        if (num==0){
            System.out.println("Zero");
        } else if (num%2==0) {
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }

    public static void grade (int score){

        String result = "Your grade is : ";

        if (score >=90) {result +="A";}
        else if ( score >=80 && score <90) { result += "B";}
        else if ( score >=70 ) { result += "C";}
        else if ( score >=60 ) { result += "D";}
        else if ( score >=50 ) { result += "E";}
        else {result+= "F";}

        System.out.println(result);





    }
}


// create a method that can check if a person is eligible to buy alcohol

//create a method that can check  if a number is odd or even or zero

//create a method that can calculate the grade  of the student