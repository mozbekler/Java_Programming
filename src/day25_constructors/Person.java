package day25_constructors;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {


    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;
    public boolean isMarried, isEmployed;

    public Person(String name,char gender, LocalDate dateOfBirth, boolean isMarried, boolean isEmployed) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
        age=LocalDate.now().compareTo(dateOfBirth);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth.format(DateTimeFormatter.ofPattern("MM/dd/y")) +
                ", isMarried=" + isMarried +
                ", isEmployed=" + isEmployed +
                '}';
    }

    public void eat(String food){
        System.out.println(name+" is eating "+food+".");
    }

    public void drink(String drink){
        System.out.println(name+" is drinking "+drink+".");
    }

    public void sleep(){
        System.out.println(name+ " is sleeping.");
    }
}
/*
name,age,gender,dateOfBirth,isMarried, isEmployed

mm/dd/yyyy

eat(String food), sleeping(), drink(String drink)


 */