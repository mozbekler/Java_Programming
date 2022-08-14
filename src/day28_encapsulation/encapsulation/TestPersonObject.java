package day28_encapsulation.encapsulation;

import java.time.LocalDate;

public class TestPersonObject {

    public static void main(String[] args) {


        Person person1 =new Person("Mehmet",'M',LocalDate.of(1984,11,8));

        System.out.println(person1);
    }
}
