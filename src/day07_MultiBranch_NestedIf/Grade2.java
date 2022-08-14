package day07_MultiBranch_NestedIf;

public class Grade2 {

    public static void main(String[] args) {

        char grade;

        grade = 'A';

        String result ="";

        if (grade == 'A'){result = "Excellent";}
        else if (grade == 'B'){result = "Great job";}
        else if (grade == 'C'){result = "Good";}
        else if (grade == 'D'){result = "Passed";}
        else if (grade == 'F'){result = "Failed";}
        else {result= "invalid";}


        System.out.println(result);






    }
}
