package day29_inheritance.encapsulation;

public class TestStudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Binnur",7,'F','A',"Inglehurst Infant School");

        System.out.println(student1);

        student1.setSchoolName("Harvard");

        student1.study();








    }
}
