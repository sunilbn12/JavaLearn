package collections;

import sun.rmi.transport.proxy.CGIHandler;

import java.util.*;

public class TreeMaps {

    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<String, Integer>();

        map.put("Sid", 4);
        map.put("Yaza", 2);
        map.put("Sunil", 35);
        map.put("Sav3", 32);
        map.put("Sid", 4);



        Map<String, Integer> hashMap = new HashMap<>(map);

        System.out.println(map.equals(hashMap));


        System.out.println(map.containsKey("Sid"));


        Iterator<String> iterator = map.keySet().iterator();
        Iterator<Integer> itr = map.values().iterator();

        while (iterator.hasNext() & itr.hasNext()) {
            System.out.println(iterator.next() + "---> " + itr.next());
        }

        char[] str = "IamagoodboyIamgoodinJavaAlso".toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            System.out.println(Character.valueOf(str[i]));
            if (charMap.containsKey(str[i])) {
                count = charMap.get(str[i]);
                count++;
                charMap.put(str[i], count);
            } else {
                charMap.put(str[i], 1);
            }
        }

        System.out.println(charMap);


    }
}
