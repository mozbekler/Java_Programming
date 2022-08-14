package day38_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

        System.out.println("Program1 started");
        Thread.sleep(2000);
        System.out.println("Program1 Ended");

        System.out.println("----------------------------------");

        System.out.println("Program2 started");
        Thread.sleep(2000);
        System.out.println("Program2 ended");

        System.out.println("Program3 started");
        //FileInputStream file= new FileInputStream("");
        System.out.println("Program3 ended");





    }
}
