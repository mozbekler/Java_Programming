package day39_collections;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        Set<Integer> set1= new HashSet<>();
        for (int i = 0; i <5; i++) {
            set1.add(i*100);
        }
        System.out.println(set1);

        Set<Integer> set2= new LinkedHashSet<>();

        for (int i = 0; i <5; i++) {
            set2.add(i*100);
        }

        System.out.println(set2);

        Set<Integer> set3= new TreeSet<>();

        ArrayList<Integer> arrayList=new ArrayList<>(set1);

        System.out.println(arrayList);



    }
}
