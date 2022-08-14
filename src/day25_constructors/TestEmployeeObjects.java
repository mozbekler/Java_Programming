package day25_constructors;

import java.time.LocalDate;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee e1=new Employee("Khashayar","Java Developer",32,'M',95000, LocalDate.of(2022,12,2));
        Employee e2=new Employee("Mohammed","Manager",31,'M',120000,LocalDate.of(2021,3,4));

        System.out.println(e1);
        System.out.println(e2);




    }
}
