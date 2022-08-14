package day13_CustomMethods;

public class eligibleToVote {
    public static void main(String[] args) {

        eligibleToVote(35,true);

        eligibleToVote(8,true);

        eligibleToVote(45,false);

        eligibleToVote(-7,true);







    }


    public static void eligibleToVote(int age,boolean isAmerican){

        if(age>=18 && isAmerican){
            System.out.println("eligible to vote");
        }else{
            System.out.println("not eligible");
        }


    }
}
