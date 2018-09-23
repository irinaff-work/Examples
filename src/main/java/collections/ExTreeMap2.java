package collections;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class ExTreeMap2 {
    public static void main(String[] args) {
        SortedMap<String, Integer> map = new TreeMap<>();
        map.put("Omega", 24);
        map.put("Alpha", 1);
        map.put("Gamma", 3);

        System.out.println(map);

        for(Map.Entry<String, Integer> name: map.entrySet()) {
            System.out.println(name.getKey() + " = " + name.getValue());
        }
    }
}
