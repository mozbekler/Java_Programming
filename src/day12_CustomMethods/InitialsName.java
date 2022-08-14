package day12_CustomMethods;

public class InitialsName {

    public static void main(String[] args) {

        initialsName("Mehmet","Ozbekler");

        initialsName("Binnur","Ozbekler");

        initialsName("       ali","     ozbekler     ");




    }

    public static void initialsName(String firstName,String lastName){

        System.out.println(firstName.toUpperCase().trim().charAt(0)+"."+lastName.toUpperCase().trim().charAt(0));

    }





}
