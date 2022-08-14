package day22_arrayList;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str="20";

        System.out.println(str+1);

        int num= Integer.parseInt(str); //unboxing

        System.out.println(num+1);

        Integer num2=Integer.valueOf(str);

        String s="20.5";
        double num3=Double.parseDouble(s);

        Double num4= Double.valueOf(s);

        char ch ='$';

        System.out.println(Character.isDigit(ch));

        boolean isLetter= Character.isLetter(ch);
        System.out.println("isLetter = " + isLetter);

        boolean isLowerCaseLetter=Character.isLowerCase(ch);
        System.out.println("isLowerCaseLetter = " + isLowerCaseLetter);

        boolean isUpperCaseLetter =Character.isUpperCase(ch);
        System.out.println("isUpperCaseLetter = " + isUpperCaseLetter);

        boolean isSpecialCharacter=!Character.isLetterOrDigit(ch);
        System.out.println("isSpecialCharacter = " + isSpecialCharacter);

        System.out.println("--------------------------------------------");

        String string = "a1b2c3d4e56";
        int sum =0;

        for (char each:string.toCharArray()
             ) {
         if (Character.isDigit(each)){
             sum += Integer.parseInt(""+each);
         }
        }

        System.out.println("sum = " + sum);






    }
}
