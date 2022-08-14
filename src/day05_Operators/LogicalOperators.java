package day05_Operators;

public class LogicalOperators {

    public static void main(String[] args) {

        double salary = 45000;
        int creditScore= 700;
        int age = 42;

        boolean eligibleForLoan = salary >= 30000 && creditScore >= 650 && age>=18 ;

        System.out.println("eligibleForLoan = " + eligibleForLoan);

        System.out.println("--------------------------------------------------");

        age = 32;
        String country = "China";

        boolean eligibleToVote = age >=18 && country== "USA";

        System.out.println("eligibleToVote = " + eligibleToVote);

        System.out.println("--------------------------------------------------");

        country= "Canada";

        boolean nativeEnglishSpeaker = country=="USA" || country== "Canada" || country=="UK" || country=="Australia";


        System.out.println("nativeEnglishSpeaker = " + nativeEnglishSpeaker);
        System.out.println("--------------------------------------------------");
        
        String answer = "maybe";

        boolean validAnswer = answer == "yes" || answer == "no";

        System.out.println("validAnswer = " + validAnswer);

        System.out.println("--------------------------------------------------");

        char grade = 'A';

        boolean passedTheExam = grade=='A' || grade == 'B' || grade=='C' ||grade =='D';

        System.out.println("passedTheExam = " + passedTheExam);





    }
}
