package collections;

import java.util.*;

public class ExTreeMap6 {
    public static void main(String[] args) {
        SortedMap<Integer, String> map = new TreeMap<>();
        SortedMap<Integer, String> map1 = new TreeMap<>();;
        int from = 0;
        int to = 0;
        int count = 0;
        Scanner reader = new Scanner(System.in);
        try {
            from = reader.nextInt();
            to = reader.nextInt();
            reader.nextLine();
            count = reader.nextInt();
            reader.nextLine();
            for (int i = 0; i < count; i++) {
                map.put(reader.nextInt(), reader.next());
                reader.nextLine();
            }

            map1 = map.subMap(from,to + 1);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("illegal input symbol");
        } finally {
            reader.close();
        }

        for(Map.Entry<Integer, String> var: map1.entrySet()) {
            System.out.println(var.getKey() + " " + var.getValue());
        }
    }
}
