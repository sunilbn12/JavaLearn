package collections;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapIteration {

    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("Sunil", 35);
        map.put("Sidd", 3);
        map.put("Yaz", 1);

        ArrayList<String> names = new ArrayList<>(map.keySet());
        for (String name : names) {
            System.out.println(name);
        }


        System.out.println("********** using entry set *************");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            System.out.println("Name is: " + entry.getKey() + " age is: " + entry.getValue());
        }


        System.out.println("********** using key set and vales *************");
        for (Integer age : map.values()) {

            System.out.println("age is:" + " " + age);
        }

        int count = 0;
        if (map.containsKey("Sidd")) {
            System.out.println(map.get("Sidd"));
            count = map.get("Sidd");
            count++;
            map.put("Sidd", count);
        }

        System.out.println(map);



       for( Map.Entry<String, Integer> set :map.entrySet()){
           System.out.println("Key is: "+set.getKey()+"and value is: "+set.getValue());
       }
    }
}
