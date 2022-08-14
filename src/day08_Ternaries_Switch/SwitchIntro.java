package day08_Ternaries_Switch;

public class SwitchIntro {

    public static void main(String[] args) {

        char grade = 'D';
        String result ="";

        if (grade=='A' || grade=='B' || grade=='C' || grade=='D'){

        result = (grade=='A')? "Excellent" :(grade =='B')? "Great job" :(grade =='C')? "Good" :(grade =='D')? "Passed" : "Failed";

        }else{result="INVALID";}

        System.out.println("result = " + result);
        System.out.println("-------------------------------------------------");

        switch (grade){

            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Great job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D' :
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("INVALID GRADE");
                break;


        }

        /*
        A: Excellent
        B:Great job
        C: Good
        D: Passed
        F: Failed
         */







    }



}
