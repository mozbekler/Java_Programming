package day07_MultiBranch_NestedIf;

public class LoanApplication {

    public static void main(String[] args) {

        int salary = 55000;
        int creditScore= 580;

        if (salary >=45000 && creditScore >=700){
            System.out.println("Eligible for loan");} else {
            System.out.println("Not eligible");}



    }
}

/*
 two variables named salary and createdScore are declared and given, write a program that can check if the person is eligible to apply for a loan
            Note:In order to be eligible for a loan:
                    1. salary: at least 45K
                    2. credit score: at least 700
 */