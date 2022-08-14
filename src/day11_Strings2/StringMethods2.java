package day11_Strings2;

import java.util.Locale;

public class StringMethods2 {

    public static void main(String[] args) {

        String sentence = "I love Python, Python is the best programming language, and Python is in high demand";

        String sentence2 = sentence.replace("Python","Java");

        System.out.println("sentence2 = " + sentence2);

        String word = "java";

        word =word.replace('a','e');  //"jeve"

        System.out.println("word = " + word);

        String sentence3 = "I love Java. Java is cool";

        //sentence3 = sentence3.replace("Java", "Python");

        System.out.println(sentence3);

        sentence3=sentence3.replaceFirst("Java","Python");

        System.out.println(sentence3);

        String sentence4 = "Java is fun, Java is cool, Java is amazing";

        sentence4=sentence4.replace("Java is cool", "Python is cool");

        System.out.println(sentence4);

        //---------------------------------------------------------------------------------

        String sentence5= "I love Java Programming";

        String languageName = sentence5.substring(7,11);

        System.out.println(languageName);

        String sentence6 = "Today is Sunday, Tomorrow is Monday";

        String today = sentence6.substring(9,15);

        System.out.println(today);

        int M = sentence6.indexOf('M');
        System.out.println(M);

//---------------------------------------------------------------

        String email = "astalavista@gmail.com";

        int beginning = email.indexOf("@")+1;

        int ending = email.lastIndexOf(".");

        String domain = email.substring(beginning,ending);

        System.out.println("domain = " + domain);

        //-------------------------------------------------------

        String  X = "I love Java Programming";

        String r1 = X.substring(7);

        System.out.println(r1);


        String D= "Today is Sunday, tomorrow is Monday";

        String tomorrow = D.substring(D.lastIndexOf('M'));

        System.out.println(tomorrow);

        System.out.println("--------------------------------------------");

        String str = "Python";
        String str2 = str + "\n";

        String result = str2.repeat(10);

        System.out.println(result);


































    }
}
