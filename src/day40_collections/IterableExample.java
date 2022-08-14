package day40_collections;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class IterableExample {

    public static void main(String[] args) {

        List<Integer> list= new ArrayList<>();

        list.addAll(Arrays.asList(1,2,4,6,4,6,8,5,3,78,5,34,3,576,7,4,3,6));

        /*for (Integer each : list){
            if (each<5){
                list.remove(each);
            }
        }
        */

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)<5){
                list.remove(i);
            }
        }

        System.out.println(list);

        System.out.println("---------------------------------------");

        List<Integer> list2= new ArrayList<>();

        list2.addAll(Arrays.asList(1,2,4,6,4,6,8,5,3,78,5,34,3,576,7,4,3,6));

        Iterator<Integer> it=list2.iterator();

        while(it.hasNext()){
            Integer each = it.next();
            if (each<5){
                it.remove();
            }
        }


        System.out.println(list2);
        System.out.println("---------------------------------------");
        List<Integer> list3= new ArrayList<>();

        list3.addAll(Arrays.asList(1,2,4,6,4,6,8,5,3,78,5,34,3,576,7,4,3,6));

        System.out.println(list3);

        for (Iterator<Integer> i=list3.iterator();i.hasNext(); ){

            Integer each=i.next();

            if (each<5){
                i.remove();
            }
        }

        System.out.println(list3);

        System.out.println("---------------------------------------");
        List<Integer> list4= new ArrayList<>();

        list4.addAll(Arrays.asList(1,2,4,6,4,6,8,5,3,78,5,34,3,576,7,4,3,6));

        list4.removeIf(p-> p<5);

        System.out.println(list4);
        System.out.println("---------------------------------------");
        List<Integer> list5= new LinkedList<>();

        list5.addAll(Arrays.asList(1,2,4,6,4,6,8,5,3,78,5,34,3,576,7,4,3,6));

        list5.removeIf(p->p<5);

        System.out.println(list5);




    }
}
