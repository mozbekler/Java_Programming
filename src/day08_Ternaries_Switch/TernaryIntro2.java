package day08_Ternaries_Switch;

public class TernaryIntro2 {

    public static void main(String[] args) {

        int number = 0;
        String result ="";

        /*
        if (number>0){
            result="Positive";
        } else if (number<0) {
            result="Negative";
        }else {
            result="Zero";
        }

        System.out.println("result = " + result);
        */

        String result2 = (number>0) ? "Positive" :(number<0)? "Negative" :"Zero";

        System.out.println("result2 = " + result2);

        System.out.println("---------------------------------------------");

        int n = 7
                ;

        String day = "";

        /*
        if (n==1){
            day = "Monday";
        } else if (n==2) {
            day="Tuesday";

        } else if (n==3) {
            day="Wednesday";
        } else if (n==4) {
            day = " Thursday";
        } else if (n==5) {
            day = "Friday";
        } else if (n==6) {
            day=" Saturday";
            else{
                day="Sunday";
            }
        }
        */

        String day2  = (n==1)? "Monday" :(n==2)? "Tuesday" :(n==3)? "Wednesday" :(n==4)? "Thursday" :(n==5)? "Friday":(n==6)? "Saturday" : "Sunday";

        System.out.println(day2);

        System.out.println("------------------------------------------------");

        int num = 0;   //1~12

        String month = (num==1)? "Jan" :(num==2)? "Feb" :(num==3)?"Mar" :(num==4)? "Apr" :(num==5)? "May" :(num==6)? "June" :(num==7)? "July" :(num==8)? "August" :(num==9)? "September" :(num==10)? "Oct" :(num==11)? "Nov":(num==12)? "December" :"Invalid Month";

        System.out.println(month);
    }
}
