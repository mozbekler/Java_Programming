package day08_Ternaries_Switch;

public class IfStatementAndTernariesPractice {

    public static void main(String[] args) {

        int score = 80;

        String result = "";

        if(score>=0 && score <=100){

            result = (score >=90) ? "A" :(score>=80)? "B" :(score >=70)? "C" :(score>=60)? "D"  : "F";

        }else{
            result="Invalid Score";
        }

        System.out.println("result = " + result);







    }
}
