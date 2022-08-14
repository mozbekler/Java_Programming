package day07_MultiBranch_NestedIf;

public class GradeReport {

    public static void main(String[] args) {

        int score = 99;

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

