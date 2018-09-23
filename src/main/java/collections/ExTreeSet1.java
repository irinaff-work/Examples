package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class ExTreeSet1 {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(10);
        sortedSet.add(15);
        sortedSet.add(13);
        sortedSet.add(21);
        sortedSet.add(17);
        //sortedSet.add(null); нельзя

        System.out.println(sortedSet); // [10, 13, 15, 17, 21]

        SortedSet<Integer> subSetLessThan16 = sortedSet.headSet(16); // [10, 13, 15]

        int maxElement = sortedSet.last(); // it is 21
    }
}
