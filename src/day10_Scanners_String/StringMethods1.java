package day10_Scanners_String;

import java.util.Locale;
import java.util.Scanner;

public class StringMethods1 {

    public static void main(String[] args) {

    String str = "Cydeo";
    //    index   01234

    char firstChar = str.charAt(0);
    char secondChar = str.charAt(1);
    char thirdChar = str.charAt(2);
    char fourthChar = str.charAt(3);
    char fifthChar = str.charAt(4);

        System.out.println("firstChar = " + firstChar);
        System.out.println("secondChar = " + secondChar);
        System.out.println("thirdChar = " + thirdChar);
        System.out.println("fourthChar = " + fourthChar);
        System.out.println("fifthChar = " + fifthChar);


    int length= str.length();

        System.out.println("length = " + length);

        int lastIndex = length-1;

        char lastChar = str.charAt(lastIndex);

        System.out.println("lastChar = " + lastChar);


        String s1= "Wooden spoon";

        char firsChar = s1.charAt(0);

        int lastIndex2 = s1.length()-1;

        char lasChar =s1.charAt(lastIndex2);

        System.out.println("lasChar = " + lasChar);

        System.out.println("------------------------------------------");

        String name1= "Binnur";
        String name2= new String("Binnur");

        System.out.println(name1==name2); // false

        System.out.println(name1.equals(name2));//true

        String r1 = "Java";
        String r2 = "Java";
        String r3 = new String("Java");

        System.out.println(r1==r2);

        System.out.println(r1==r3);

        System.out.println(r1.equals(r3));
        System.out.println(r2.equals(r3));

        System.out.println("---------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("how old are your?");
        int age = input.nextInt();

        System.out.println("Are you a US citizen? yes/no");
        String answer = input.next();

        if (age>=21 && answer.equalsIgnoreCase("yes")){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }


















    input.close();


    }
}
