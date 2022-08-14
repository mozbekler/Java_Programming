
package day18_garbageCollection;

import java.lang.Math;
import java.util.Scanner;

public class replit {

    public static void main(String[] args) {
        /*String even="";
        String odd="";

        for (int i = 1; i <=20; i++) {
            if (i%2==0){
                even=even+" "+i;
            }

        }System.out.println(even);

        for (int j = 1; j <20 ; j++) {
            if (j%2==1){
                odd=odd+" "+j;
            }




        }
        System.out.println(odd);



        String alphabet="";

        for (char i = 'A'; i <='Z' ; i++) {

            alphabet=alphabet+i;
        }
        System.out.println(alphabet);

        String reverseAlphabet="";
        for (char i = 'z'; i >='a' ; i--) {

            reverseAlphabet=reverseAlphabet+i;
        }
        System.out.println(reverseAlphabet);



        int inhabitants=100;

        System.out.println("Day 0 ["+ inhabitants+ "]");

        for (int i = 1; i <20; i++) {

            if (inhabitants>1){
                inhabitants= inhabitants/2;
                System.out.println("Day "+ i + " ["+ inhabitants+ "]");

        } else {
                System.out.println("----EXTINCT----");
                break;
            }

        }
        int growth=0;
        int treeSize=0;


        for (int i = 1; i <=10 ; i++) {
            if(i<=3){
                growth=1;
                treeSize=treeSize+growth;
                System.out.println("year "+i+" - growth "+growth+" cm");
                System.out.println("tree size: "+treeSize+" cm");}
            else{
                growth=2;
                treeSize=treeSize+growth;
                System.out.println("year "+i+" - growth "+growth+" cm");
                System.out.println("tree size: "+treeSize+" cm");
            }

            }


        String word="Heallou";

        for (int i = 0; i <word.length() ; i++) {

            System.out.println(word.charAt(i));

        }
        System.out.println("------------------------------------------------------------");

        String output="";
        for (int i = 0; i <word.length() ; i++) {
            if (word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' ||word.charAt(i)=='o' || word.charAt(i)=='u'){
               output=output+word.charAt(i);


        } System.out.print(output);}*/




        /*String sentence="We study java not python";

        int javaCounter=0;
        int pythonCounter=0;

        while(sentence.contains("java")){
            sentence=sentence.replaceFirst("java","");
           javaCounter++;
        }

        while(sentence.contains("python")){
            sentence=sentence.replaceFirst("python","");
            pythonCounter++;
        }

        System.out.println(javaCounter==pythonCounter); */


        String str= "xxxabyyyycd";
        int tripleCounter=0;

        for (int i = 0; i < str.length()-2; i++) {
            if ((str.charAt(i)==str.charAt(i+1)) &&(str.charAt(i)==str.charAt(i+2))){
                tripleCounter++;
            }
        }
        System.out.println(tripleCounter);







        /*
        Use a loop to count how many times the characters java and python are found in the given String sentence. Output true if java and python appear the same number of times, otherwise output false.
Note: Case sensitivity should be considered. We are looking for the lowercase character versions of both Strings
         */

        /*

        Scanner sentence = new Scanner(System.in);
        String answer="yes";

        System.out.println("Please enter the guest's name:");
        String guestList=input.next();


        while(answer.equalsIgnoreCase("yes")) {
            System.out.println("Do you want to enter another guest's name?");
            answer = input.next();
            if(answer.equalsIgnoreCase("no")){
                System.out.println(guestList);
                continue;}
            System.out.println("Please enter the guest's name:");
            guestList = guestList + ", " + input.next();




        }*/






        /*
Please enter the guest's name:
  Nick
Do you want to enter another guest's name?
  yes
Please enter the guest's name:
  Linda
Do you want to enter another guest's name?
  no
Guests' list: Nick, Linda
         */











        }





    }

