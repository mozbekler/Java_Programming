package day07_MultiBranch_NestedIf;

public class GradeLevel2 {

    public static void main(String[] args) {

       int gradeLevel=2; //1~18

       String result = "";

       if (gradeLevel<1) {result = "invalid";}
       else if (gradeLevel<=5){result="Elementary School";}
       else if (gradeLevel<=8){result="Middle School";}
       else if (gradeLevel<=12){result="High School";}
       else if (gradeLevel<=16){result="College";}
       else if (gradeLevel<=18){result="Grad School";}
       else {result = "invalid";}

        System.out.println(result);


    }
}
/*
2. An integer variable named gradeLevel is declared and given, Write a
program to determine and print which school type someone is in.
(Only if the given number is a valid number, then print the school type.
Otherwise print Invalid)
Ex:
gradeLevel = 2
output:
Elementary School
The grade level and types are:
1 ~ 5: Elementary school
6 ~ 8: Middle school
9 ~ 12: High school
13 ~ 16: College
17 ~ 18: Grad School
 */