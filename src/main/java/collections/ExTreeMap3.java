package collections;

import java.util.*;

public class ExTreeMap3 {
    public static void main(String[] args) {
        SortedMap<String, Integer> map = new TreeMap<>();
        Integer count = 0;
        Scanner reader = new Scanner(System.in);
        try {
            List<String> list = new ArrayList<>(Arrays.asList(reader.nextLine().toLowerCase().split(" ")));
            for (String world : list) {
                count = map.getOrDefault(world, 0);
                if (count == 0) {
                    map.put(world, 1);
                } else {
                    map.put(world, count + 1);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("illegal input symbol");
        } finally {
            reader.close();
        }

        for(Map.Entry<String, Integer> name: map.entrySet()) {
            System.out.println(name.getKey() + " " + name.getValue());
        }
    }
}
