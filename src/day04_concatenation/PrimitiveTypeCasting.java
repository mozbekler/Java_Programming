package day04_concatenation;

public class PrimitiveTypeCasting {

    public static void main(String[] args) {

        //--------------Implicit Casting-----------------

        byte a = 15;

        short b = a;

        System.out.println("b = " + b);

        float c = a;  //implicit casting

        System.out.println("c = " + c);

        //--------------Explicit casting---------------

        int x = 100;
        byte y = (byte) x;

        System.out.println("y = " + y);

        float z = 203.8f;
        short q = (short) z;

        System.out.println("q = " + q);

        int r = 50000;
        short t = (short) r;   // Because 50000 is out of range if short, it gives another value

        System.out.println("t = " + t);

    }
}
