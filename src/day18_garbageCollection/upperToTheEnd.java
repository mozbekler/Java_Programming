package day18_garbageCollection;

public class upperToTheEnd {

    public static void main(String[] args) {

        System.out.println(shiftUpperCaseCharsToEnd("aaaaBBBBASDAASDasadafafafWERTYasdf@@@@@@sadsfsdfaASDFASQasdaeqwEDA|Dw"));

    }

    public static String shiftUpperCaseCharsToEnd(String inputString){
        String resultLowerCase="";
        String resultUpperCase="";
        String result="";
        for (int i = 0; i <inputString.length(); i++) {
            if (inputString.charAt(i)>='a' && inputString.charAt(i)<='z'){
                resultLowerCase=resultLowerCase+inputString.charAt(i);
            } else if (inputString.charAt(i)>='A' && inputString.charAt(i)<='Z') {
               resultUpperCase=resultUpperCase +inputString.charAt(i);
            }

        }
        return resultLowerCase+resultUpperCase;
    }



}

/*
   * Move All Uppercase Characters to the End
   * Given a string that contains uppercase letters as well as lower case letters.
   * The task is to move all uppercase characters at the end of the String.
   * The uppercase characters must be in the same order as in the original string.
   */
