package day13_CustomMethods;

public class WarmUpTasks {
    public static void main(String[] args) {

    calculator(13,11,'+');

        calculator(13,11,'-');

        calculator(13,11,'*');

        calculator(13,11,'/');

        calculator(13,11,'@');

        ageGroup(-3);

        ageGroup(89);
        ageGroup(37);
        ageGroup(7);


    }
    public static void calculator(double num1,double num2, char mathOperator){
        double result =0;
        if (mathOperator=='+'){
            result=num1+num2;
        }else if (mathOperator=='-') {
            result=num1-num2;
        }else if( mathOperator=='*'){
            result=num1*num2;
        } else if (mathOperator=='/') {
            result=num1/num2;
        }else {
            System.err.println("Invalid operator");
        }

        if (mathOperator=='+'||mathOperator=='-' ||mathOperator=='*' || mathOperator=='/'){
            System.out.println("result = " + result);
        } else {
            System.err.println("Please reset and use a valid operator");
        }


    }

    public static void ageGroup (int age){

        String result = (age<21 && age>0)? "Teenager" :(age >=21 && age<55) ? "Adult" :(age>=55) ? "Senior" : "Invalid value";
        System.out.println("result = " + result);
    }




}
/*
1. Create a method named calculate that can take three arguments:
            num1 (double)
            num2 (double)
            mathOperator (char)

    The method should display the calculation result of those two numbers as long as the 3rd argument is a valid math operator, otherwise the method prints "Invalid Operator"

        Ex:
            calculate(10, 20, '+')

        output:
            10 + 20 = 30


2. Create a method named ageGroup that can print the age group of the person

        age groups are:
                Teenager (< 21)
                Adult   (>=21 && <55 )
                Senior  ( > 55 )





 */