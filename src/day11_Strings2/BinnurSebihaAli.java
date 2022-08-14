package day11_Strings2;

import day09_Scanners.IfAndSwitch;

import java.util.Scanner;

public class BinnurSebihaAli {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a name from your family members");

        String name = input.next();

        if (name.equals("Binnur") || name.equals("Sebiha") || name.equals("Ali") || name.equals("Mehmet") ){
            if (name.equals("Binnur")) {
                System.out.println(" Bizim ilk evladımız. Binnur bizim canımız.");
            } else if (name.equals("Sebiha")) {
                System.out.println("Evimizin annesi. Herşeyimiz kendisi");
            } else if (name.equals("Ali")) {
                System.out.println("Yeni katildi bize. Evimize verir neşe");
              }else {
                System.out.println("Bir de ust katta  Mehmet. O da ders çalisir ilelebet");
            }
        }else{
            System.out.println("Name is not correct");
        }

    }
}
