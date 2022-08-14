package day11_Strings2;

public class longestWord {
    public static void main(String[] args) {
        String word1="asdfvgbhnj";
        String word2="asdfgfdhfghafdarfsf";

        if (word1.length()>word2.length()){
            System.out.println(word1);
        }else {
            System.out.println(word2);
        }




    }
}
/*
Use String methods and if statements to find which of the given words is the longest one. Compare the two inputs word1 and word2 and print the word with more characters.
Note: The two words will not have the same lengths
Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation, if statements

Ex:
  Input:
    bill
    check

  Output:
    check
Ex:
  Input:
    fashion
    pear

  Output:
    fashion
 */