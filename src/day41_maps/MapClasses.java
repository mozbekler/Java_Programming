package day41_maps;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {


        Map<String, Integer> hashMap = new HashMap<>(); //random order, accepts null key

        hashMap.put("Daniel",95000);
        hashMap.put("Emily",100000);
        hashMap.put("Bella", 85000);
        //hashMap.put("Daniel",80000);
        hashMap.put("Arron", 78000);
        hashMap.put("Chris", null);
        hashMap.put("Brenna", null);
        hashMap.put(null,120000);
        hashMap.put(null,110000);
        hashMap.put(null,100000);

        System.out.println("hashMap="+hashMap);
        System.out.println("------------------------------------------------");
        
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(); // insertion order, accepts NULL key

        linkedHashMap.put("Daniel",95000);
        linkedHashMap.put("Emily",100000);
        linkedHashMap.put("Bella", 85000);
        //linkedHashMap.put("Daniel",80000);
        linkedHashMap.put("Arron", 78000);
        linkedHashMap.put("Chris", null);
        linkedHashMap.put("Brenna", null);
        linkedHashMap.put(null,120000);
        linkedHashMap.put(null,110000);
        linkedHashMap.put(null,100000);

        System.out.println("linkedHashMap = "+linkedHashMap);
        System.out.println("------------------------------------------------");
        
        
        Map<String, Integer> treeMap = new TreeMap<>(); // sorted (ascending) order, does not accept NULL as a key
        
        treeMap.put("Daniel",95000);
        treeMap.put("Emily",100000);
        treeMap.put("Bella", 85000);
        //treeMap.put("Daniel",80000);
        treeMap.put("Arron", 78000);
        treeMap.put("Chris", null);
        treeMap.put("Brenna", null);
        //treeMap.put(null,120000);
        //treeMap.put(null,110000);
        //treeMap.put(null,100000);

        System.out.println("treeMap = "+treeMap);
        System.out.println("------------------------------------------------");

        Map<String, Integer> hashtable = new Hashtable<>(); //random order, SYNCHRONIZED, does not accept NULL as a KEY
        hashtable.put("Daniel",95000);
        hashtable.put("Emily",100000);
        hashtable.put("Bella", 85000);
        //hashtable.put("Daniel",80000);
        hashtable.put("Arron", 78000);
        //hashtable.put("Chris", null);
        //hashtable.put("Brenna", null);
        //hashtable.put(null,120000);
        //hashtable.put(null,110000);

        try{
            hashtable.put(null,100000);
        } catch(RuntimeException e){
            e.printStackTrace();
        }


        System.out.println("hashtable = "+ hashtable);
        


    }
}
/*
pair= name & salary

 */