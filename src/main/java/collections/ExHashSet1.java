package collections;

import java.util.HashSet;
import java.util.Set;

public class ExHashSet1 {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(null);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(4);
        set2.add(1);

        Set<Integer> resultSet = new HashSet<>();
        resultSet.addAll(set1); // union empty set and [0, 1, 2]
        resultSet.addAll(set2); // union [0, 1, 2] and [3, 2, 4, 1]

        System.out.println(resultSet); // contains only unique elements from both sets [0, 1, 2, 3, 4]
    }
}
