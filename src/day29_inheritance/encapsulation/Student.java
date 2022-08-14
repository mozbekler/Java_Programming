package day29_inheritance.encapsulation;

public class Student {

    private String name;
    private int age;
    private char gender;
    private char grade;
    private String schoolName;

        public String getName(){ //READ ONLY
            return name;
        }

        public void setName(String name){ //WRITE ONLY
            if (name.isEmpty()){
                System.err.println("Invalid student name");
                System.exit(1);
            }
            this.name=name;
        }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
            if (age<5 && age>90){
                System.err.println("age can not be less than 5 or greater than 90");
                System.exit(1);
            }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
            if (!(gender=='M' || gender=='F')){
                System.err.println("Invalid input for gender");
                System.exit(1);
            }
        this.gender = gender;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
            if (!(grade=='A' || grade=='B' || grade=='C' || grade =='D' || grade=='F')){
                System.err.println("Invalid input for grade: "+ grade);
                System.exit(1);
            }
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public void study(){
        System.out.println(name+" is studying at "+schoolName);
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
/*
 1. Create a class named Student:
            private variables:
                name, age, gender, grade, schoolName

            Encapsulate all the fileds (at leat encapsulate two fields manually)
                    requirments:
                        1. age can not be less than 5 or greater than 90
                        2. gender should not be set to any chanarcter other than: 'M' and 'F'
                        3. grade should not be set to any chanacters other than: 'A', 'B', 'C', 'D', and 'F'

            Add a constructor that can set all teh fields when the object is created
                        (requirments of fileds in the above must be applied)


            Methods:
                study()
                toString()
 */
