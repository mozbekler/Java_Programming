package day22_arrayList;
import java.util.ArrayList;

public class IteratingArrayList {
    public static void main(String[] args) {

      ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <10; i++) {
            numbers.add(100*i+100);
        }


        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {  //This is the ITERATION of the array list
            System.out.println(numbers.get(i));
        }

        System.out.println("-----------------------------------------------------------------------");
        for (Integer number : numbers) {  //Iteration with foreach
            System.out.println(number);
        }




    }
}
