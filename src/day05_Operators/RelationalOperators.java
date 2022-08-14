package day05_Operators;

public class RelationalOperators {

    public static void main(String[] args) {

        int a = 1000;
        int b = 200;

        System.out.println(a>b);

        boolean aIsGreater = a>b;

        System.out.println("aIsGreater = " + aIsGreater);

        System.out.println("----------------------------------");

        int score =60;
        boolean passed = score>=60;

        System.out.println("passed = " + passed);
        System.out.println("----------------------------------");

        int age = 15;
        boolean eligibleToBuyAlcohol = age>=21;

        System.out.println("eligibleToBuyAlcohol = " + eligibleToBuyAlcohol);
        System.out.println("----------------------------------");

        System.out.println(100>=100);
        System.out.println(100>=85);

        System.out.println("----------------------------------");

        score = 48;

        boolean failed = score <60;

        System.out.println("failed = " + failed);

        System.out.println(1000<10000);


        System.out.println("----------------------------------");

        System.out.println(95<=100); //true

        System.out.println(100<=100); //true

        System.out.println("----------------------------------");

        // system.out.println("Java" <="C"); // >,<, <=,>= can only be applicable for numbers

        System.out.println('a' > 'b');

        //                  65>66 (ASCII VALUES) so false






    }
}
