package day14_forLoop;

public class MethodOverLoadingPractice {

    public static void main(String[] args) {

        System.out.println(sum(13,15));

        String s1= "jaVa";

        System.out.println(s1.toUpperCase());

        

    }

    public static int sum(int n1,int n2){
        return n1+n2;
    }

    public static int sum(int n1,int n2, int n3){
        return n1+n2+n3;
    }

    public static int sum( int n1, int n2, int n3, int n4){
        return n1+n2+n3+n4;
    }


}
