package day39_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionInterface {

    public static void main(String[] args) {

        String myGroup[] = new String[5];

        myGroup[0]="Yulia";
        myGroup[1]="Glen";
        myGroup[2]="Yusuf";
        myGroup[3]="Sebastian";

        myGroup[myGroup.length-1]= "Sumeye";

        ArrayList<String> list= new ArrayList<>();
        list.addAll(Arrays.asList(myGroup));

        System.out.println("isEmpty: "+list.isEmpty());

        list.add("Mehmet");

        list.add("Ekaterina");
        list.add("kicchi");
        list.add("Miyasar");

        System.out.println(list.contains("Mehmet"));

        boolean doesContainAll=list.containsAll(Arrays.asList(myGroup));

        System.out.println("doesContainAll = " + doesContainAll);


        System.out.println(list);

        String[] group= new String[list.size()];

        for (int i = 0; i < group.length; i++) {
            group[i]=list.get(i);
        }

        System.out.println(Arrays.toString(group));










    }

}
