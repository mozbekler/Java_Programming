package day32_finalKeyword;

import java.time.LocalDate;
class CydeoStudent {

    public final void language(){
        System.out.println("Java Programming");
    }




}

public class FinalKeyword extends CydeoStudent {

    /*@Override    // final methods can not be overriden
    public void language(){
        System.out.println("Python programming");
    }

     */

    public FinalKeyword(){

    }

    public static void main(String[] args) {


        final char gender ='M';

        System.out.println(gender);

        //gender = 'F';//compile error

        //System.out.println(gender);

        System.out.println("---------------------------------");

        final LocalDate DOB = LocalDate.now();

        System.out.println(DOB);

        new FinalKeyword().language();
        new CydeoStudent().language();


    }


}
