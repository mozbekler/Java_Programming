package day32_finalKeyword.PersonTask;

import java.time.LocalDate;

public class TestPersonObject {

    public static void main(String[] args) {

        Person person = new Person("Daniel",'M', LocalDate.of(1991,1,3));

        System.out.println(person);

        Employee employee = new Employee("Emily",'F', LocalDate.of(1989,1,9),"Accountant",68000);

        System.out.println(employee);



    }
}
