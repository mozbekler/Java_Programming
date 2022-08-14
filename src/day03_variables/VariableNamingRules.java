package day03_variables;

public class VariableNamingRules {

    public static void main(String[] args) {

        //age of the student is 28

        int age = 28;

        //int age =32; // variable names must be unique

        System.out.println(age);

        int salary = 10000;

        System.out.println(salary);

        int phoneNumber = 07712122345; //use camel case to make it readable

        double salaryBeforeTax = 10000.45;

        System.out.println(salaryBeforeTax);

        //no spaces
        //letters form A to Z can be used, _(underscore) or $ can be used

        double abstract1 = 10;

        System.out.println(abstract1);

        // variable names can not be Java reserved words for example double abstract = 10.7;


        String gender = "Male";

        System.out.println(gender);

        System.out.println();
    }
}
