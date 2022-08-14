package day18_garbageCollection;

public class GarbageCollection {

    public static void main(String[] args) {

        String s1="Java";

        s1=null; //"Java" will be eligible for garbage collection

        System.out.println(s1);

       //System.out.println(s1.replace(null,"Python"));

        String str1="Python";



    }
}
