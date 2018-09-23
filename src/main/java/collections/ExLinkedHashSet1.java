package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExLinkedHashSet1 {

    public static void main(String[] args) {
        Set<Character> orderedSet = new LinkedHashSet<>();

        for (char c = 'a'; c <= 'k'; c++) {
            orderedSet.add(c);
        }
        orderedSet.add(null);
        System.out.println(orderedSet); // the order is always [a, b, c, d, e, f, g, h, i, j, k]

        Set<String> set = new LinkedHashSet<>();
        set.add("Alpha");
        set.add("Gamma");
        set.add("Omega");
        System.out.println(set);
    }
}
