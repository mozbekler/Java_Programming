package day11_Strings2;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {

        String str1 = "CYDEO SCHOOL";

        str1 = str1.toLowerCase();

        System.out.println(str1);

        System.out.println("---------------------------");


        String str2 = "java programming";

        str2=str2.toUpperCase();

        System.out.println(str2);
        System.out.println("---------------------------");

        String word = "Wooden Spoon";
        word = word.toUpperCase();

        word = word.toLowerCase();

        System.out.println(word);

        String str4= "              Cydeo School ";

        str4=str4.trim();

        System.out.println(str4);

        int a = str4.indexOf('C');

        System.out.println(a);

        String sentence1 = "Today is Sunday, and we have Java class";

        int indexNo = sentence1.indexOf('J');

        System.out.println(indexNo);

        int firstA = sentence1.indexOf('a');

        int secondA = sentence1.indexOf("ay, ");

        System.out.println("firstA = " + firstA);
        System.out.println("secondA = " + secondA);



        String s2= "Java Python JavaScript Cydeo Python";

        int a1 = s2.indexOf('a');

        System.out.println("a1 = " + a1);

        int a2 = s2.indexOf("a Python");

        System.out.println("a2 = " + a2);

        int a3 = s2.indexOf("avaScript");
        System.out.println("a3 = " + a3);

        int a4 = s2.indexOf("aScript");
        System.out.println("a4 = " + a4);

        System.out.println(s2.lastIndexOf('a'));

        System.out.println(s2.lastIndexOf('J'));

        System.out.println(s2.length());

        String word2 = "javanana";

        System.out.println(word2.lastIndexOf('a'));

































    }


}
