package day42_maps;

import day33_abstraction.employeeTask.Developer;
import day35_polymorphism.transportationTask.Car;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapPractice4 {
    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>();

        person1.put("name","Arthur");
        person1.put("gender",'M');
        person1.put("age",32);
        person1.put("job_title","Developer");
        person1.put("salary",100000);
        person1.put("hired_date", LocalDate.of(2021,1,15));
        person1.put("married",true);



        Map<String, Object> person2 = new LinkedHashMap<>();

        person2.put("name","Nora");
        person2.put("gender",'F');
        person2.put("age",31);
        person2.put("job_title","Back-End Developer");
        person2.put("salary",90000);
        person2.put("hired_date", LocalDate.of(2022,8,15));
        person2.put("married",true);



        Map<String, Object> person3 = new LinkedHashMap<>();

        person3.put("name","Sebiha");
        person3.put("gender",'F');
        person3.put("age",31);
        person3.put("job_title","Back-End Developer");
        person3.put("salary",90000);
        person3.put("hired_date", LocalDate.of(2022,8,15));
        person3.put("married",true);

        Map<String, Object> person4 = new LinkedHashMap<>();
        person4.put("name","Binnur");
        person4.put("gender",'F');
        person4.put("age",31);
        person4.put("job_title","Back-End Developer");
        person4.put("salary",90000);
        person4.put("hired_date", LocalDate.of(2021,8,15));
        person4.put("married",true);

        Map<String, Object> person5 = new LinkedHashMap<>();
        person5.put("name","Mehmet");
        person5.put("gender",'M');
        person5.put("age",37);
        person5.put("job_title","Back-End Developer");
        person5.put("salary",90000);
        person5.put("hired_date", LocalDate.of(2022,8,15));
        person5.put("married",true);

        Map<Integer, Map<String, Object>> mapOfMaps = new LinkedHashMap<>();

        mapOfMaps.put(0,person1);
        mapOfMaps.put(1,person2);
        mapOfMaps.put(2,person3);
        mapOfMaps.put(3,person4);
        mapOfMaps.put(4,person5);

        System.out.println(mapOfMaps);

        System.out.println(mapOfMaps.get(1));

        mapOfMaps.get(1).replace("salary",120000);

        System.out.println(mapOfMaps.get(1));

        for (Map<String, Object> eachValue : mapOfMaps.values()) {
            for (Map.Entry<String, Object> eachEntry : eachValue.entrySet()) {
                if (eachEntry.getKey().equals("salary")){
                    eachEntry.setValue((Integer)eachEntry.getValue()+10000);
                }
            }
        }

        System.out.println(mapOfMaps);
        System.out.println("-----------------------------------------------------------------");

       Map< Map<String, Object>, Map<String,Object>> mapOfMaps2 = new LinkedHashMap<>();

       Map<int[], List<Integer>> map2= new LinkedHashMap<>();

       Map<Developer, Car> map3 = new LinkedHashMap<>();






    }
}
