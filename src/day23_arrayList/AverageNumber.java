package day23_arrayList;

import java.util.ArrayList;

public class AverageNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();

        list.add(20);
        list.add(20);
        list.add(90);
        list.add(260);
        list.add(70);
        list.add(20);
        list.add(50);
        list.add(30);

        System.out.println(list);

        int sum=0;

        for (Integer each:list
             ) {
            sum+=each;
        }


        double average = sum/((double)list.size());

        System.out.println(average);


    }
}
