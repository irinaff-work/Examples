package concarent_collections;

import java.util.*;

/**
 * TODO: comment
 *
 * @autor irinaff
 * @since 21.03.2019
 * Map
 **/

public class Lesson_1_5 {
    public static void main(String[] args) {
        Map mapA = new HashMap();
        SortedMap<String, Integer> mapB = new TreeMap();

        mapA.put("key1", "element 1");
        mapA.put("key2", "element 2") ;
        mapA.put("key3", "element 3");

        mapB.put("key1", 1);
        mapB.put("key2", 1) ;
        mapB.put("key3", 3);

        //key iterator
        Iterator<String> iterator = mapA.keySet().iterator();
        //value iterator
        Iterator<String> iterator1 = mapA.values().iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            Object value = mapA.get(key);
        }

        //functional way to iterate and print
        iterator1.forEachRemaining(System.out::println);

        //access via new for-loop
        for (Object key: mapA.keySet()) {
            Object value =mapA.get(key);
        }
        //using Entry

        for (Map.Entry<String, Integer> entry : mapB.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }

        //in java8
        mapB.forEach((k, v) -> System.out.println(k + ":" + v));
        }
}
