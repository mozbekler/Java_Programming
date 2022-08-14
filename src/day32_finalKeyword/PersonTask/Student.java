package day32_finalKeyword.PersonTask;

import java.time.LocalDate;

public final class Student extends Person{

    private char grade;

    public Student(String name, char gender, int age, LocalDate dateOfBirth, char grade) {
        super(name, gender, dateOfBirth);
        setGrade(grade);
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
}
