package day14_forLoop;

public class Test {

    public static void main(String[] args) {

        String word = "XJavxax";

        if((word.charAt(0)=='x' || word.charAt(0)=='X') && (word.charAt(word.length()-1)=='X'|| word.charAt(word.length()-1)=='x')){

            System.out.println(word.substring(1,word.length()-1));
        }
        else if (word.charAt(word.length()-1)=='X'|| word.charAt(word.length()-1)=='x'){
            System.out.println(word.substring(0,word.length()-1));
        } else if (word.charAt(0)=='x' || word.charAt(0)=='X') {

            System.out.println(word.substring(1));
        }else{
            System.out.println(word);
        }
    }
    }


