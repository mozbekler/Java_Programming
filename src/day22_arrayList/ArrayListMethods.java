package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>();

    list.add(100);
    list.add(20);
    list.add(23);

        System.out.println(list);

    list.add(1,1000);

        System.out.println(list);

    list.add(2,2500);

        System.out.println(list);
        System.out.println(list.size());

        System.out.println(list.get(2));

        System.out.println("---------------------------------------------------");

        ArrayList<String> yildizList = new ArrayList<>();
        yildizList.add("Muhammed");
        yildizList.add("Ebubekir");
        yildizList.add("Omer");
        yildizList.add("Osman");
        yildizList.add("Ali");

        System.out.println(yildizList.size());
        System.out.println(yildizList);

        System.out.println(yildizList.get(0));
        System.out.println(yildizList.get(yildizList.size()-1));

        for (int i = 0; i < yildizList.size(); i++) {
            System.out.println(yildizList.get(i));
        }





    }
}
