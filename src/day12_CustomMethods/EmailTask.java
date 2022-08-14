package day12_CustomMethods;

public class EmailTask {

    public static void main(String[] args) {

        String email = "nur_oz@hotmail.com";

        String first = email.substring(0,email.indexOf('_'));
        String last  = email.substring(email.indexOf('_')+1,email.indexOf('@'));
        String domain = email.substring(email.indexOf('@'));

        email = last+"_"+first+domain;

        System.out.println("email = " + email);

    }
}
