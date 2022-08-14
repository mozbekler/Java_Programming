package day26_statics.studentTask;

public class TestObjects {

    public static void main(String[] args) {



    Student student1 = new Student("Yusuf", 21, 'M', "A16");

    Student student2 = new Student("Glenio", 24, 'M', "B34");
    Student student3 = new Student("Sumeyye", 22, 'F', "C56");
    Student student4 = new Student("Mehmet", 25, 'M', "D43");
    Student student5 = new Student("Sebastian", 23, 'M', "E27");

    Student[] students={student1,student2, student3,student4,student5};

    StudentsGroup group1= new StudentsGroup("Java Turtles",1);

    group1.addStudent(students);

    group1.addStudent("Khashayar",34,'M',"F35");

    System.out.println(group1);


    group1.removeStudent("E27");

    System.out.println(group1);

        for (Student each : group1.students) {
            System.out.println(each.name +" : "+each.id);
        }


        StudentsGroup group2 = new StudentsGroup("Group2",2);
        StudentsGroup group3 = new StudentsGroup("Group3",3);
        StudentsGroup group4 = new StudentsGroup("Group4",4);


        StudentsGroup[] groups={group1,group2,group3,group4};

    }
}
/*
3. Create a class named TestObjects
	            3.1 Create 5 Student objects
	            3.2 Create a StudentGroup object
	            3.3 Add all the student objets to the StudentsGroup object' students list
 */