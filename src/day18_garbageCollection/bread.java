package day18_garbageCollection;

public class bread {

    public static void main(String[] args) {

    String str="aaaaaaaaaaaaaaaa";



        if (!str.contains("bread")){
            System.out.println("nothing");
        }else if (str.indexOf("bread")==str.lastIndexOf("bread")) {
            System.out.println("nothing");
        }else{
            String output= str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread"));
            System.out.println(output);
        }





    }

}
/*
Use String methods and if statements to find what is inside of the sandwich. A sandwich is two pieces of bread with something between them. We want to see what is between our bread pieces. There will have only one input str. Inside of the str String we will look for the first occurrence of the text 'bread' and the last occurrence of the text 'bread'. Using those two points we will pull out the text between them.
If there is not two pieces of bread print the text: nothing
 */
