package day42_maps;

import java.time.LocalDate;
import java.util.*;

public class MapPractice2 {
    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>();

        person1.put("name","Arthur");
        person1.put("gender",'M');
        person1.put("age",32);
        person1.put("job_title","Developer");
        person1.put("salary",100000.5);
        person1.put("hired_date", LocalDate.of(2021,1,15));
        person1.put("married",true);

        System.out.println(person1);

        Map<String, Object> person2 = new LinkedHashMap<>();

        person2.put("name","Nora");
        person2.put("gender",'F');
        person2.put("age",31);
        person2.put("job_title","Back-End Developer");
        person2.put("salary",90000);
        person2.put("hired_date", LocalDate.of(2022,8,15));
        person2.put("married",true);

        System.out.println(person2.get("name"));

        System.out.println(person2.get("job_title"));

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

        List<Map<String, Object>> listOfMaps = new ArrayList<>();

        listOfMaps.addAll(Arrays.asList(person1,person2,person3,person4,person5));

        System.out.println(listOfMaps);

        System.out.println(listOfMaps.size());

        for (Map<String, Object> eachMap : listOfMaps) {
            System.out.println(eachMap);
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                System.out.println(eachEntry);
            }
        }
        System.out.println("__________________________");

        //display the names of the employee who are hired this year (2022)

        for (Map<String, Object> eachMap : listOfMaps) {
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                if (eachEntry.getKey().equals("hired_date")){
                    if (((LocalDate)eachEntry.getValue()).getYear()==2022){
                        System.out.println(eachMap.get("name"));

                    }
                }
            }
        }

        System.out.println(listOfMaps);

        listOfMaps.get(0).replace("name","Vasyl");
        System.out.println(listOfMaps);

        listOfMaps.get(listOfMaps.size()-1).replace("salary",((Integer)listOfMaps.get(listOfMaps.size()-1).get("salary"))+50000);

        System.out.println(listOfMaps);

        listOfMaps.get(1).replace("age",(Integer)listOfMaps.get(1).get("age")+7);

        System.out.println(listOfMaps);
        System.out.println("__________________________");

        Map<String, Object> car1 = new LinkedHashMap<>();
        car1.put("brand","BMW");
        car1.put("model","X5");
        car1.put("year",2021);
        car1.put("color","white");
        car1.put("price", 45000.5);


        Map<String, Object> car2 = new LinkedHashMap<>();
        Map<String, Object> car3 = new LinkedHashMap<>();
        Map<String, Object> car4 = new LinkedHashMap<>();
        Map<String, Object> car5 = new LinkedHashMap<>();


        List<Map<String, Object>> cars = new ArrayList<>();

        cars.addAll(Arrays.asList(car1,car2,car3,car4,car5));


    }

}
