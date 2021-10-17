package collections;

import java.util.*;
import java.util.stream.Collectors;


public class SortMapByValues {

    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Sunil", 35);
        map.put("Sidd", 3);
        map.put("Yaz", 1);

        System.out.println(map.size());

        LinkedHashMap<String, Integer> sortedMapbyValue =
                map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey,
                Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        LinkedHashMap<String, Integer> sortedMapByKeys = map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey,
                Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        List<String> list = map.keySet().stream().collect(Collectors.toList());
        System.out.println(list);

        System.out.println("before sorting: "+map);
        System.out.println("after sorting: "+sortedMapbyValue);
        System.out.println("sorted by Keys: "+sortedMapByKeys);

    }
}
