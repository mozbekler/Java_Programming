package day07_MultiBranch_NestedIf;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score =123;

        if (score>=0 && score <=100) {           // if the score is valid

            if (score >= 60) {                  //if the score is equal or greater than 60
                System.out.println("Passed");
            } else {                            //if the score is less than 60
                System.out.println("failed");
            }
        } else {                                   // if the score is not valid
            System.out.println("invalid score");}

        System.out.println("-----------------------------------------------------");

        int age = 232;

        if (age>0 && age<=150) {

        if (age>=21) {
            System.out.println("eligible");}
        else {
            System.out.println("not eligible");}
        } else {
            System.out.println("invalid age");
        }

        System.out.println("-----------------------------------------------------");

        int month = 12;


        if (month>=1 && month<=12){

            if (month==1){
                System.out.println("January");}
            else if (month==2){
                System.out.println("February");}
            else if (month==3){
                System.out.println("March");}
            else if(month==4){
                System.out.println("April");}
            else if (month==5){
                System.out.println("May");}
            else if (month==6){
                System.out.println("June");}
            else if (month==7){
                System.out.println("July");}
            else if (month==8){
                System.out.println("August");}
            else if (month==9){
                System.out.println("September");}
            else if (month==10){
                System.out.println("October");}
            else if (month==11){
                System.out.println("November");}
            else{
                System.out.println("December");}
        } else {
            System.out.println("invalid value");





    }
}}
