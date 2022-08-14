package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list1.addAll(1,numbers);


        System.out.println(list1);
        System.out.println("-----------------------------------------------------");

        ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));

        System.out.println(scores);

        System.out.println("-----------------------------------------------------");

        ArrayList<String> employeesList = new ArrayList<>();
        employeesList.addAll(Arrays.asList("Alena","Muhtar","Gadir","Ali"));

        System.out.println(employeesList);

        boolean hasAlena = employeesList.contains("Alena");
        System.out.println("hasAlena = " + hasAlena);

        boolean hasContainThem= employeesList.containsAll(Arrays.asList("Alena","Muhtar","Mehmet"));

        System.out.println("hasContainThem = " + hasContainThem);

        System.out.println("-----------------------------------------------------");

        ArrayList<String> developers = new ArrayList<>();
        developers.addAll(Arrays.asList("Ali","Veli","Selami","Mehmet","Mahmut","Ali","Veli"));
        
        developers.retainAll(Arrays.asList("Ali","Veli"));

        System.out.println("developers = " + developers);





















    }
}
