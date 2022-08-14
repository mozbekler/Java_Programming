package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person[] people = {new Person(),new Person(), new Person(), new Person(),new Person()};

        people[0].setInfo("Mehmet",'M', LocalDate.of(1984,11,8));
        people[1].setInfo("Sebiha",'F', LocalDate.of(1986,9,15));
        people[2].setInfo("Binnur",'F', LocalDate.of(2015,1,6));
        people[3].setInfo("Ali Akif",'M', LocalDate.of(2021,10,5));
        people[4].setInfo("Kemal",'M', LocalDate.of(1938,5,19));

        ArrayList<Person> studentList = new ArrayList<>();

        studentList.addAll(Arrays.asList(people));

        //Print name and date of births
        for (Person each : studentList) {
            System.out.println(each.name+" : "+each.dateOfBirth);
        }

        //remove all the person object that has the age of >55
        studentList.removeIf(p->p.age>55);

        System.out.println(studentList);


















    }
}
