package collections;

import java.util.*;

public class ExSet1 {
    public static void main(String[] args) {
        //Select all cases when the following statement returns true.
        //set1.equals(set2);
        //Cases:

        //a)
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        System.out.println("a) set1.equals(set2): " + set1.equals(set2));

        //b)
        Set<Integer> set3 = new HashSet<>();
        set3.add(1);
        set3.add(2);
        set3.add(3);

        Set<Integer> set4 = new HashSet<>();
        set4.add(3);
        set4.add(2);
        set4.add(1);
        System.out.println("b) set1.equals(set2): " + set3.equals(set4));

        //c)
        Set<Integer> set5 = new HashSet<>();
        set5.add(1);
        set5.add(2);
        set5.add(3);

        Set<Integer> set6 = new LinkedHashSet<>();
        set6.add(1);
        set6.add(3);
        set6.add(2);
        System.out.println("c) set1.equals(set2): " + set5.equals(set6));

        //d)
        Set<Integer> set7 = new LinkedHashSet<>();
        set7.add(1);
        set7.add(3);
        set7.add(2);

        Set<Integer> set8 = new LinkedHashSet<>();
        set8.add(1);
        set8.add(3);
        System.out.println("d) set1.equals(set2): " + set7.equals(set8));

        //e)
        SortedSet<Integer> set9 = new TreeSet<>();
        set9.add(1);
        set9.add(3);

        Set<Integer> set10 = new LinkedHashSet<>();
        set10.add(3);
        set10.add(1);
        System.out.println("e) set1.equals(set2): " + set9.equals(set10));
    }
}
