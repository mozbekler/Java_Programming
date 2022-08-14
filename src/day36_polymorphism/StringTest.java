package day36_polymorphism;

public class StringTest {
    public static void main(String[] args) {

        char data[] = {'a', 'b', 'c'};
        String str = new String(data);

        System.out.println(str); //abc



        String str1="DJR";
        String str2="DJR";

        System.out.println(str1==str2);

        String str3= new String("DJR");

        System.out.println(str1==str3);
        System.out.println(str2==str3);

        str3=str3.intern();

        System.out.println(str1==str3);










    }
}
