package day17_customClass;

public class TestEmployeeObjects {

    public static void main(String[] args) {

      Employee employee1 = new Employee();

      employee1.setInfo("Mehmet",37,'M',"Teacher",99000,"A12");

      Employee employee2 =new Employee();
      employee2.setInfo("Glen", 35,'M',"Java DEveloper",100000,"A13");

      Employee employee3 = new Employee();
      employee3.setInfo("Khashayar",29,'M',"Back-End Developer", 124000,"C14");

      employee1.salary=200000;
      employee1.jobTitle="Physics Teacher and Java Developer";



        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        employee1.work();
        employee2.vacation();
        employee3.work();





    }
}
