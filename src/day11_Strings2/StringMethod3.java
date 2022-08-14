package day11_Strings2;

public class StringMethod3 {

    public static void main(String[] args) {

        String word = "WoodenSpoon";

        boolean r1 = word.isEmpty();

        System.out.println(r1);

        //--------------------------------------


        String str = "                ";

        boolean r2 = str.isEmpty();
        boolean r3 = str.isBlank();

       System.out.println("r2 = " + r2);
       System.out.println("r3 = " + r3);


       String str1 = "Cydeo";

       String str2 = new String("Cydeo");

        System.out.println(str1==str2);

        System.out.println(str1.equals(str2));

        //-------------------------------------

        String s1 = "JAVA";
        String s2 = "java";

        System.out.println(s1.equals(s2));

        System.out.println(s1.equalsIgnoreCase(s2));

        String students = "Hasan Naran Sumeye Natalia";

        boolean hasAhmed = students.contains("Ahmed");

        System.out.println(hasAhmed);

        boolean hasHasan = students.contains("Hasan");
        System.out.println(hasHasan);


        String sentence = "My favorite programming language is JAVA";

        boolean hasJava = sentence.toLowerCase().contains("java");

        System.out.println("hasJava = " + hasJava);
        //-----------------------------------------------

        String name = "Michael";

        boolean L = name.startsWith("Mi");

        System.out.println("L = " + L);


        String url = "www.cydeo.com";

        boolean isValid =url.startsWith("www.");

        System.out.println(isValid);

        //---------------------------------------------------

        boolean isCom = url.endsWith(".com");

        System.out.println(isCom);

        //----------------------------------------------------

        String email = "CydeoSchool@gmail.com";

        boolean isGmail = email.endsWith("gmail.com");

        System.out.println("isGmail = " + isGmail);























    }
}
