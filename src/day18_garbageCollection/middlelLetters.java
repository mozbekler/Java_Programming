package day18_garbageCollection;

public class middlelLetters {

    public static void main(String[] args) {

        String word="javac";

        if(word.length()%2==0) {
            System.out.print(""+word.charAt(word.length()/2 -1)+word.charAt(word.length() / 2));
        }else{
            System.out.print(word.charAt((word.length()-1)/2));
        }
    }
}
