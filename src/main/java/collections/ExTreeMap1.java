package collections;

import java.time.LocalDate;
import java.util.SortedMap;
import java.util.TreeMap;

public class ExTreeMap1 {
    public static void main(String[] args) {
        SortedMap<LocalDate, String> events = new TreeMap<>();

        events.put(LocalDate.of(2017, 6, 6), "The Java Conference");
        events.put(LocalDate.of(2017, 6, 7), "Another Java Conference");
        events.put(LocalDate.of(2017, 6, 8), "Discussion: career or education?");
        events.put(LocalDate.of(2017, 6, 9), "The modern art");
        events.put(LocalDate.of(2017, 6, 10), "Coffee master class");

        LocalDate fromInclusive = LocalDate.of(2017, 6, 8);
        LocalDate toExclusive = LocalDate.of(2017, 6, 10);

        System.out.println(events.subMap(fromInclusive, toExclusive));
    }
}
