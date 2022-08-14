package day40_collections;

import java.util.*;

public class IterablePractice1 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));

        Iterator<String> it = names.iterator();

        while (it.hasNext()){
            String each =it.next();
            if (each.equalsIgnoreCase("ahmed")){
                it.remove();
            }
        }

        System.out.println(names);
        System.out.println("-------------------------------");

        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));

        names2.removeIf(p->p.equalsIgnoreCase("ahmed"));
        System.out.println(names2);

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,4,5,3,2,5,6,7,8,875,4,3,6,2,2,6,2,234,6,2,26,2,26,2,2,6));

        //find the nth largest number

        int n=5;
        for (int i = 0; i <n-1 ; i++) {
            numbers.removeIf(p-> Collections.max(numbers)==p);
        }

        int max= Collections.max(numbers);

        System.out.println(max);




    }
}
