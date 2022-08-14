package day11_Strings2;

public class fiveCharacters {
    public static void main(String[] args) {

String word = "appleeee";

if (word.length()<5){
    System.out.println("Too short!");
} else if (word.length()>5) {
    System.out.println("Too long!");
}else {
    System.out.println(""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0));
}


    }
}
/*
Use String methods and if statements to reverse a String that is five characters long. If the given word is not five characters long, it will not be reversed. Use the following to output a value:
If the word is less than 5 characters: print Too short!
If the word is more than 5 characters: print Too long!
If the word is 5 characters: print the reversed version of the String. Reading characters from the end to the beginning.
Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation, if statements

Ex:
  Input:
    cat

  Output:
    Too short!
Ex:
  Input:
    singularity

  Output:
    Too long!
Ex:
  Input:
    apple

  Output:
    elppa
 */