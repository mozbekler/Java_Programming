package day14_forLoop;

public class StringReverse {

    public static void main(String[] args) {

        String word = "Cydeo School";
        String reverse="";

        for (int i =word.length()-1; i>=0; i--) {
            reverse+=word.charAt(i);

        }

        System.out.println(reverse);

        System.out.println(reverse("Mehmet"));



    }

    public static String reverse(String word){
        String reverse="";
        for (int i =word.length()-1; i>=0; i--) {
            reverse+=word.charAt(i);

        }
        return reverse;
    }
}
