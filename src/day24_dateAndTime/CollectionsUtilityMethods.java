package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethods {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java","Java","Java","c#","c#","Ruby","Swift","Swift","Java" ));

        System.out.println(names);

        Collections.replaceAll(names,"Java","Python");

        System.out.println(names);


        System.out.println(Collections.frequency(names,"Python"));

        int frequency=Collections.frequency(names,"c#");

        System.out.println(frequency);

        for (String each : names) {
            if (Collections.frequency(names,each)==1){
                System.out.println(each);
            }
        }

    }
}
