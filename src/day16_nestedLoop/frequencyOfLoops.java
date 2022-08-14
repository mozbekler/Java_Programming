package day16_nestedLoop;

public class frequencyOfLoops {

    public static void main(String[] args) {

        String sentence = "Java Java Java Java Java";
        String word = "Java";

        int count=0;

        while(sentence.contains(word)){
            count++;
            sentence = sentence.replaceFirst("Java","");
        }

        System.out.println(count);




    }
}
/*
3.  Write a program that can return the frequency of the word java from a sentence
		    Ex:
		        sentence = "java JAVA jAvA JAva"

		    output:
		        4
 */