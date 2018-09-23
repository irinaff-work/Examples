package collections;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

//Илья Соловьёв
public class ExTreeMap6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] borders = new int[2];
        borders[0] = scanner.nextInt();
        borders[1] = scanner.nextInt();
        int total = scanner.nextInt();
        NavigableMap<Integer, String> map = new TreeMap<>();
        for (int i = 0; i < total; i++) map.put(scanner.nextInt(), scanner.next());
        map = map.subMap(borders[0], true, borders[1], true);
        for (Map.Entry<Integer, String> entry : map.entrySet()) System.out.println(entry.getKey() + " " + entry.getValue());
    }
}
