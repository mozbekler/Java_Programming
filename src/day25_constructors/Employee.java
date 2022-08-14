package day25_constructors;

import java.time.LocalDate;

public class Employee {

    public String name,jobTitle;
    public int age;
    public char gender;
    public double salary;
    public LocalDate hired_date;

    public Employee(String name, String jobTitle, int age, char gender, double salary, LocalDate hired_date) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.hired_date = hired_date;
    }// allows us to set all the instance variables of the object as soon as the object is created

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                ", hired_date=" + hired_date +
                '}';
    }// allows us to print the object when its passed in the print statement

}
