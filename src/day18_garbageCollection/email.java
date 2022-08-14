package day18_garbageCollection;

public class email {

    public static void main(String[] args) {

        String email="sergey_brin@gmail.com";

        String firstName=email.substring(0,email.indexOf('_'));
        firstName=firstName.substring(0,1).toUpperCase() +firstName.substring(1);

        String lastName = email.substring(email.indexOf('_')+1,email.indexOf('@'));
        lastName=lastName.substring(0,1).toUpperCase() +lastName.substring(1);

        String domain= email.substring(email.indexOf('@')+1,email.indexOf('.'));
        domain=domain.substring(0,1).toUpperCase()+domain.substring(1);


        System.out.println("First name: "+firstName);
        System.out.println("Last name: "+lastName);
        System.out.println("Domain: "+domain);


    }




}
/*
Ex:
  Input:
    sergey_brin@gmail.com

  Output:
    First name: Sergey
    Last name: Brin
    Domain: Gmail
 */