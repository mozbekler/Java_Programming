package day11_Strings2;

public class mergeWordsif3Char {

    public static void main(String[] args) {
        String word1="ali";
        String word2="nur";

        if(word1.length()==3 && word2.length()==3){
            System.out.println(""+word1.charAt(0)+word2.charAt(0)+word1.charAt(1)+word2.charAt(1)+word1.charAt(2)+word2.charAt(2));
        }else{
            System.out.println("cannot merge");
    }

        }


    }

