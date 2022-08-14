package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {

        int[] array={1,2,3,4,5};

        array[0]=100;

        System.out.println(Arrays.toString(array));

        System.out.println("-----------------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.add("Eggs");
        groceriesList.add("Paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking oil");

        groceriesList.set(2,"Orange");

        System.out.println(groceriesList);

        groceriesList.add(2,"chicken");

        System.out.println(groceriesList);

        System.out.println("-----------------------------------");

        groceriesList.remove(0);
        System.out.println(groceriesList);
        groceriesList.remove("Orange");
        System.out.println(groceriesList);
        groceriesList.remove("Orange");
        System.out.println(groceriesList);

        System.out.println("-----------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

       boolean r1= numbers.remove(Integer.valueOf(20));

        System.out.println(numbers);
        System.out.println(r1);

        System.out.println("-----------------------------------");

        numbers.clear();

        System.out.println(numbers);
        System.out.println("-----------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.add("Ebubekir");
        names.add("Omer");
        names.add("Osman");
        names.add("Ali");
        names.add("Hamza");
        names.add("Ali");
        names.add("Ali");
        names.add("Ebubekir");

        System.out.println(names.indexOf("Ali"));
        System.out.println(names.lastIndexOf("Ali"));

        for (String each:names
             ) {
            if (names.indexOf(each)==names.lastIndexOf(each)){
                System.out.println(each);
                break;
            }
        }





    }
}
