package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class DexCollection1 {
    public static void main(String[] args) {
        Collection set = new HashSet();
        set.add(1000);
        set.add("Hello");
        set.add(new Object());

        Collection <Integer> set1 = new HashSet <> ();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        //Collections.sort(set,(o1, o2)->o2.compareTo(o1));//descending order(5 4 3 2 1)

        Collection<? super Number> c = new ArrayList<>();
        c.add(100);
        c.add(100.9999);
        //c.add("d"); error!!!
    }
}
