package day10_Scanners_String;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadFilesWithScanner {

    public static void main(String[] args) throws IOException {


       Scanner scan = new Scanner (Path.of("C:\\Users\\LENOVO PARKSON\\IdeaProjects\\Java_Programming\\src\\day10_Scanners_String\\Test.txt"));

        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());

scan.close();

    }

}
