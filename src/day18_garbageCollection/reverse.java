package day18_garbageCollection;

public class reverse {

    public static void main(String[] args) {

        String word = "abcde";

        for (int i = word.length() - 1; i >= 0; i--) {

            System.out.print("" + word.charAt(i));
        }

    }


}