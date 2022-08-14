package day14_forLoop;

public class WarmUpTasks {

    public static void main(String[] args) {

        System.out.println(combine("mehmet","taha"));

        System.out.println(sum2(2,5));

        System.out.println(sum3(1,2,4));

        System.out.println(sum4(1,2,3,4));

        String s1=""+true;

        System.out.println(s1);

        String s2 = ""+ 'e';



    }

    public static String combine(String  str1,String str2){

        String result;

        if (str1.endsWith(""+ str2.charAt(0))){
            result=str1+str2.substring(1);
        }else{
            result=str1+str2;
        }

        return result;
    }

    public static int sum2(int n1, int n2){
        int result;
        return result=n1+n2;
    }

    public static int sum3(int n1, int n2, int n3){
        int result;
        return result =sum2(n1,n2)+n3;
    }

    public static int sum4(int n1, int n2, int n3, int n4){
        int result;
        return result = sum3(n1,n2,n3) + n4;
    }

}
/*
Task1:
    Create a method named combine that can take two string and hen add them together and returns it.
        But if the last letter of the first word and the first letter of the last letter are the same, return that character once.

        combine("one", "eight")  ==> oneight

Task 2:
    1. create a method that can find the sum of two integer numbers
                method name: sumOf2Numbers

    2. create a method that can find the sum of three integer numbers
                method name: sumOf3Numbers

    3. create a method that can find the sum of four integer numbers
                method name: sumOf4Numbers
 */
