package day25_constructors;

import java.time.LocalDate;

public class TestPersonObjects {
    public static void main(String[] args) {

        Person p1= new Person("Mehmet",'M', LocalDate.of(1984,11,8), true,false);

        System.out.println(p1);



    }
}
