package day42_maps;

import java.util.*;

public class FrequencyOfCharacters {
    public static void main(String[] args) {


        String str = "bbcccaaaaa";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")),each);

            map.put(each.charAt(0),frequency);

            }

        System.out.println(map);









    }



}


/*
. Write a program that can return the frequency of characters
            Not: MUST use map

                Ex: str = "bbcccaaaaa"

                output:
                    {b=2, c=3, a=5}


 */
