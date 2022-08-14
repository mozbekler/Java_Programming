package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class TestPersonObjects {
    public static void main(String[] args) {


        Student student=new Student("Binnur",'F', LocalDate.of(2015,1,5),'A',"A123456789");
        Employee employee=new Employee("Mehmet",'M',LocalDate.of(1984,11,8),"B12345","Java Developer",80000);
        President president = new President("Daniel",'M',LocalDate.of(1954,11,11),LocalDate.of(2020,1,3));
        Teacher teacher = new Teacher("Emily",'F',LocalDate.of(1985,11,1),"3esadq23","Math teacher",48000);

        System.out.println(student);
        System.out.println(employee);
        System.out.println(president);
        System.out.println(teacher);

        student.study();
        teacher.teach();
        president.lie();

        student.eat("Baklava");
        teacher.eat("Kebab");
        president.eat("Donut");

        student.drink("milk");
        teacher.drink("tea");
        president.drink("coffee");










    }
}
