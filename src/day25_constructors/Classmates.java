package day25_constructors;

import java.time.LocalDate;

public class Classmates {

    public String name;
    public int age;
    public LocalDate dateOfBirth;

    public void setInfo(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Classmates{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
