package day23_arrayList;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();
        names.add("Ebubekir");
        names.add("Omer");
        names.add("Osman");
        names.add("Ali");
        names.add("Hamza");
        names.add("Ali");
        names.add("Ali");
        names.add("Ebubekir");

        ArrayList<String> nonDup= new ArrayList<>();

        for (String each:names
             ) {
            if(nonDup.contains(each)) {
                continue;
            }
            nonDup.add(each);
        }


        System.out.println(names);
        System.out.println(nonDup);

    }
}
